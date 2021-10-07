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

package com.liferay.external.collection.provider.internal.model;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.portal.kernel.model.ClassedModel;
import com.liferay.portal.kernel.security.RandomUtil;

import java.io.Serializable;

/**
 * @author Jürgen Kappler
 */
public class StarWarsCharacter implements ClassedModel {

	public StarWarsCharacter(
		String name, String birthYear, String gender, String height,
		String hairColor, String eyeColor) {

		_id = RandomUtil.nextInt(10000);
		_name = name;
		_birthYear = birthYear;
		_gender = gender;
		_height = height;
		_hairColor = hairColor;
		_eyeColor = eyeColor;
	}

	public String getBirthYear() {
		return _birthYear;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return null;
	}

	public String getEyeColor() {
		return _eyeColor;
	}

	public String getGender() {
		return _gender;
	}

	public String getHairColor() {
		return _hairColor;
	}

	public String getHeight() {
		return _height;
	}

	public long getId() {
		return _id;
	}

	@Override
	public Class<?> getModelClass() {
		return StarWarsCharacter.class;
	}

	@Override
	public String getModelClassName() {
		return StarWarsCharacter.class.getName();
	}

	public String getName() {
		return _name;
	}

	public Serializable getPrimaryKeyObj() {
		return _id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable serializable) {
	}

	private final String _birthYear;
	private final String _eyeColor;
	private final String _gender;
	private final String _hairColor;
	private final String _height;
	private final long _id;
	private final String _name;

}