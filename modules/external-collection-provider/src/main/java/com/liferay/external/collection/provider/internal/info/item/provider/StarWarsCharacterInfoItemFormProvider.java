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
import com.liferay.info.field.InfoFieldSet;
import com.liferay.info.form.InfoForm;
import com.liferay.info.item.provider.InfoItemFormProvider;
import com.liferay.info.localized.InfoLocalizedValue;

import org.osgi.service.component.annotations.Component;

/**
 * @author Jürgen Kappler
 */
@Component(
	immediate = true, property = "service.ranking:Integer=100",
	service = InfoItemFormProvider.class
)
public class StarWarsCharacterInfoItemFormProvider
	implements InfoItemFormProvider<StarWarsCharacter> {

	@Override
	public InfoForm getInfoForm() {
		return InfoForm.builder(
		).infoFieldSetEntry(
			InfoFieldSet.builder(
			).infoFieldSetEntry(
				StarWarsCharacterInfoItemFields.nameInfoField
			).infoFieldSetEntry(
				StarWarsCharacterInfoItemFields.genderInfoField
			).infoFieldSetEntry(
				StarWarsCharacterInfoItemFields.heightInfoField
			).infoFieldSetEntry(
				StarWarsCharacterInfoItemFields.hairColorInfoField
			).infoFieldSetEntry(
				StarWarsCharacterInfoItemFields.eyeColorInfoField
			).labelInfoLocalizedValue(
				InfoLocalizedValue.localize(
					StarWarsCharacterInfoItemFields.class, "character")
			).build()
		).name(
			"Star Wars Character"
		).build();
	}

	@Override
	public InfoForm getInfoForm(StarWarsCharacter starWarsCharacter) {
		return getInfoForm();
	}

}