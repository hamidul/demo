<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.kernel.dao.search.ResultRow"%>
<%@ include file="../init.jsp" %>

<%
	ResultRow row = (ResultRow) request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
	Book book = (Book) row.getObject();
%>


<liferay-ui:icon-menu>
	<portlet:actionURL name="viewBook" var="viewURL">
		<portlet:param name="bookId" value="<%=String.valueOf(book.getBookId()) %>"/> 
	</portlet:actionURL>
	<liferay-ui:icon image="view" url="<%=viewURL.toString() %>"/>
	
	
	<portlet:actionURL  var="editBookURL" name="viewEdit">
		<portlet:param name="bookId"	value="<%=String.valueOf(book.getBookId())%>" />
	</portlet:actionURL>
	
	<liferay-ui:icon image="edit" url="<%=editBookURL.toString() %>"/> 
	
	<portlet:actionURL name="deleteBook" var="deleteURL">
		<portlet:param name="bookId"
			value="<%=String.valueOf(book.getBookId())%>" />
	</portlet:actionURL>
	
	<liferay-ui:icon-delete image="delete" url="<%= deleteURL.toString()%>"/>
</liferay-ui:icon-menu>