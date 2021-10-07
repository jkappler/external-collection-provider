<%--
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
--%>

<%@ include file="/info/item/renderer/init.jsp" %>

<%
StarWarsCharacter starWarsCharacter = (StarWarsCharacter)request.getAttribute(StarWarsWebKeys.STAR_WARS_CHARACTER);
%>

<td class="table-cell-expand-smallest">
	<span class="text-truncate-inline">
		<span class="text-truncate"><%= starWarsCharacter.getName() %></span>
	</span>
</td>
<td class="table-cell-expand-smallest">
	<span class="text-truncate-inline">
		<span class="text-truncate"><%= starWarsCharacter.getBirthYear() %></span>
	</span>
</td>
<td class="table-cell-expand-smallest">
	<span class="text-truncate-inline">
		<span class="text-truncate"><%= starWarsCharacter.getGender() %></span>
	</span>
</td>
<td class="table-cell-expand-smallest">
	<span class="text-truncate-inline">
		<span class="text-truncate"><%= starWarsCharacter.getHeight() %></span>
	</span>
</td>
<td class="table-cell-expand-smallest">
	<span class="text-truncate-inline">
		<span class="text-truncate"><%= starWarsCharacter.getHairColor() %></span>
	</span>
</td>
<td class="table-cell-expand-smallest">
	<span class="text-truncate-inline">
		<span class="text-truncate"><%= starWarsCharacter.getEyeColor() %></span>
	</span>
</td>