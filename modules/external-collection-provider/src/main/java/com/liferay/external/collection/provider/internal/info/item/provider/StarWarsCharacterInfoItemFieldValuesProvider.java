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

package com.liferay.external.collection.provider.internal.info.item.provider;

import com.liferay.external.collection.provider.internal.info.item.fields.StarWarsCharacterInfoItemFields;
import com.liferay.external.collection.provider.internal.model.StarWarsCharacter;
import com.liferay.info.field.InfoFieldValue;
import com.liferay.info.item.InfoItemFieldValues;
import com.liferay.info.item.InfoItemReference;
import com.liferay.info.item.provider.InfoItemFieldValuesProvider;

import java.util.ArrayList;
import java.util.List;

import org.osgi.framework.Constants;
import org.osgi.service.component.annotations.Component;

/**
 * @author Jürgen Kappler
 */
@Component(
	immediate = true, property = Constants.SERVICE_RANKING + ":Integer=10",
	service = InfoItemFieldValuesProvider.class
)
public class StarWarsCharacterInfoItemFieldValuesProvider
	implements InfoItemFieldValuesProvider<StarWarsCharacter> {

	@Override
	public InfoItemFieldValues getInfoItemFieldValues(
		StarWarsCharacter starWarsCharacter) {

		return InfoItemFieldValues.builder(
		).infoFieldValues(
			_getInfoFieldValues(starWarsCharacter)
		).infoItemReference(
			new InfoItemReference(
				StarWarsCharacter.class.getName(), starWarsCharacter.getId())
		).build();
	}

	private List<InfoFieldValue<Object>> _getInfoFieldValues(
		StarWarsCharacter starWarsCharacter) {

		List<InfoFieldValue<Object>> infoFieldValues = new ArrayList<>();

		infoFieldValues.add(
			new InfoFieldValue<>(
				StarWarsCharacterInfoItemFields.nameInfoField,
				starWarsCharacter.getName()));

		infoFieldValues.add(
			new InfoFieldValue<>(
				StarWarsCharacterInfoItemFields.genderInfoField,
				starWarsCharacter.getGender()));

		infoFieldValues.add(
			new InfoFieldValue<>(
				StarWarsCharacterInfoItemFields.birthYearInfoField,
				starWarsCharacter.getBirthYear()));

		infoFieldValues.add(
			new InfoFieldValue<>(
				StarWarsCharacterInfoItemFields.heightInfoField,
				starWarsCharacter.getHeight()));

		infoFieldValues.add(
			new InfoFieldValue<>(
				StarWarsCharacterInfoItemFields.hairColorInfoField,
				starWarsCharacter.getHairColor()));

		infoFieldValues.add(
			new InfoFieldValue<>(
				StarWarsCharacterInfoItemFields.eyeColorInfoField,
				starWarsCharacter.getEyeColor()));

		return infoFieldValues;
	}

}