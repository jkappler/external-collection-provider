/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.external.collection.provider.internal.info.collection.provider;

import com.liferay.external.collection.provider.internal.model.StarWarsCharacter;
import com.liferay.info.collection.provider.CollectionQuery;
import com.liferay.info.collection.provider.InfoCollectionProvider;
import com.liferay.info.pagination.InfoPage;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.util.Http;

import java.io.IOException;

import java.net.HttpURLConnection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Jürgen Kappler
 */
@Component(immediate = true, service = InfoCollectionProvider.class)
public class StarWarsCharacterInfoCollectionProvider
	implements InfoCollectionProvider<StarWarsCharacter> {

	@Override
	public InfoPage<StarWarsCharacter> getCollectionInfoPage(
		CollectionQuery collectionQuery) {

		JSONObject starWarsCharactersJSONObject =
			_getStarWarsCharactersJSONObject();

		if (starWarsCharactersJSONObject == null) {
			return InfoPage.of(
				Collections.emptyList(), collectionQuery.getPagination(), 0);
		}

		List<StarWarsCharacter> starWarsCharacters = new ArrayList<>();
		JSONArray jsonArray = starWarsCharactersJSONObject.getJSONArray(
			"results");

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject starWarsCharacter = jsonArray.getJSONObject(i);

			starWarsCharacters.add(
				new StarWarsCharacter(
					starWarsCharacter.getString("name"),
					starWarsCharacter.getString("birth_year"),
					starWarsCharacter.getString("gender"),
					starWarsCharacter.getString("height"),
					starWarsCharacter.getString("hair_color"),
					starWarsCharacter.getString("eye_color")));
		}

		return InfoPage.of(
			starWarsCharacters, collectionQuery.getPagination(),
			starWarsCharactersJSONObject.getInt("count"));
	}

	@Override
	public String getLabel(Locale locale) {
		return "Star Wars Characters";
	}

	private JSONObject _getStarWarsCharactersJSONObject() {
		Http.Options options = new Http.Options();

		options.setLocation("https://swapi.dev/api/people");

		try {
			String responseJSON = _http.URLtoString(options);

			Http.Response response = options.getResponse();

			if (response.getResponseCode() == HttpURLConnection.HTTP_OK) {
				return JSONFactoryUtil.createJSONObject(responseJSON);
			}
		}
		catch (IOException | JSONException exception) {
			return JSONFactoryUtil.createJSONObject();
		}

		return null;
	}

	@Reference
	private Http _http;

}