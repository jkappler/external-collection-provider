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

package com.liferay.external.collection.provider.internal.info.item.fields;

import com.liferay.info.field.InfoField;
import com.liferay.info.field.type.TextInfoFieldType;
import com.liferay.info.localized.InfoLocalizedValue;

/**
 * @author Jürgen Kappler
 */
public class StarWarsCharacterInfoItemFields {

	public static final InfoField<TextInfoFieldType> birthYearInfoField =
		BuilderHolder._builder.infoFieldType(
			TextInfoFieldType.INSTANCE
		).name(
			"birthYear"
		).labelInfoLocalizedValue(
			InfoLocalizedValue.localize(
				StarWarsCharacterInfoItemFields.class, "birth-year")
		).build();
	public static final InfoField<TextInfoFieldType> eyeColorInfoField =
		BuilderHolder._builder.infoFieldType(
			TextInfoFieldType.INSTANCE
		).name(
			"eyeColor"
		).labelInfoLocalizedValue(
			InfoLocalizedValue.localize(
				StarWarsCharacterInfoItemFields.class, "eye-color")
		).build();
	public static final InfoField<TextInfoFieldType> genderInfoField =
		BuilderHolder._builder.infoFieldType(
			TextInfoFieldType.INSTANCE
		).name(
			"gender"
		).labelInfoLocalizedValue(
			InfoLocalizedValue.localize(
				StarWarsCharacterInfoItemFields.class, "gender")
		).build();
	public static final InfoField<TextInfoFieldType> hairColorInfoField =
		BuilderHolder._builder.infoFieldType(
			TextInfoFieldType.INSTANCE
		).name(
			"hairColor"
		).labelInfoLocalizedValue(
			InfoLocalizedValue.localize(
				StarWarsCharacterInfoItemFields.class, "hair-color")
		).build();
	public static final InfoField<TextInfoFieldType> heightInfoField =
		BuilderHolder._builder.infoFieldType(
			TextInfoFieldType.INSTANCE
		).name(
			"height"
		).labelInfoLocalizedValue(
			InfoLocalizedValue.localize(
				StarWarsCharacterInfoItemFields.class, "height")
		).build();
	public static final InfoField<TextInfoFieldType> nameInfoField =
		BuilderHolder._builder.infoFieldType(
			TextInfoFieldType.INSTANCE
		).name(
			"name"
		).labelInfoLocalizedValue(
			InfoLocalizedValue.localize(
				StarWarsCharacterInfoItemFields.class, "name")
		).build();

	private static class BuilderHolder {

		private static final InfoField.NamespacedBuilder _builder =
			InfoField.builder(
				StarWarsCharacterInfoItemFields.class.getSimpleName());

	}

}