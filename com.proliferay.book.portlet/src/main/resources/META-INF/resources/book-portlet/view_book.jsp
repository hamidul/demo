<%@ include file="../init.jsp" %>


<portlet:renderURL var="backURL">
	<portlet:param name="jspPage" value="/book-portlet/view.jsp"/>
</portlet:renderURL>

<liferay-ui:header backURL="<%=backURL%>" title="Back" />

<%
	Book book = (Book) request.getAttribute("bookEntry");
%>


<aui:form>
	<aui:model-context bean="<%=book%>" model="<%=Book.class%>" />
	<aui:input name="bookName" label="Book Name" disabled="true"/>
	<aui:input type="textarea" name="description" label="Description" disabled="true"/>
	<aui:input name="authorName" label="Author Name" disabled="true"/>
	<aui:input name="isbn" label="ISBN" disabled="true"/>
	<aui:input name="price" label="Price" disabled="true"/>		
</aui:form>