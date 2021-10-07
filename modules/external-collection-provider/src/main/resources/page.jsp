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

<%@ include file="/init.jsp" %>

<%
FragmentRendererContext fragmentRendererContext = (FragmentRendererContext)request.getAttribute(FragmentRendererContext.class.getName());

FragmentEntryLink fragmentEntryLink = fragmentRendererContext.getFragmentEntryLink();

String fragmentEntryLinkNamespace = fragmentEntryLink.getNamespace() + fragmentEntryLink.getFragmentEntryLinkId();
%>

<form id="<%= fragmentEntryLinkNamespace %>form">
	<label>
		<span><%= LanguageUtil.get(request, "date") %></span>

		<input name="date" type="date" />
	</label>
</form>

<liferay-frontend:component
	context='<%=
			HashMapBuilder.<String, Object>put(
				"fragmentEntryLinkId", fragmentEntryLink.getFragmentEntryLinkId()
		).put(
				"fragmentEntryLinkNamespace", fragmentEntryLinkNamespace
		).build()
	%>'
	module="DateFilter"
/>