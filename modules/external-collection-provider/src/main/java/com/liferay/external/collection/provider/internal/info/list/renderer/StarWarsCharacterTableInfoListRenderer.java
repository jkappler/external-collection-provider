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

package com.liferay.external.collection.provider.internal.info.list.renderer;

import com.liferay.external.collection.provider.internal.model.StarWarsCharacter;
import com.liferay.info.list.renderer.InfoListRenderer;
import com.liferay.info.taglib.servlet.taglib.InfoListBasicTableTag;
import com.liferay.portal.kernel.language.LanguageUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.ListUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.osgi.service.component.annotations.Component;

/**
 * @author Jürgen Kappler
 */
@Component(immediate = true, service = InfoListRenderer.class)
public class StarWarsCharacterTableInfoListRenderer
	implements InfoListRenderer<StarWarsCharacter> {

	@Override
	public String getLabel(Locale locale) {
		return LanguageUtil.get(locale, "table");
	}

	@Override
	public void render(
		List<StarWarsCharacter> starWarsCharacters,
		HttpServletRequest httpServletRequest,
		HttpServletResponse httpServletResponse) {

		if (ListUtil.isEmpty(starWarsCharacters)) {
			return;
		}

		InfoListBasicTableTag infoListBasicTableTag =
			new InfoListBasicTableTag();

		ArrayList<String> columnNames = new ArrayList<>(
			Arrays.asList(
				"Name", "Birth Year", "Gender", "Height", "Hair Color",
				"Eye Color"));

		infoListBasicTableTag.setInfoListObjectColumnNames(columnNames);

		infoListBasicTableTag.setInfoListObjects(starWarsCharacters);

		infoListBasicTableTag.setItemRendererKey(
			StarWarsCharacterTableRowInfoItemRenderer.class.getName());

		try {
			infoListBasicTableTag.doTag(
				httpServletRequest, httpServletResponse);
		}
		catch (Exception exception) {
			_log.error("Unable to render object entries list", exception);
		}
	}

	private static final Log _log = LogFactoryUtil.getLog(
		StarWarsCharacterTableInfoListRenderer.class);

}