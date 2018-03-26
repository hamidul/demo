
<%@ include file="../init.jsp" %>


<portlet:renderURL var="viewaddPageURL">
	<portlet:param name="jspPage" value="/book-portlet/add_book.jsp"/>
</portlet:renderURL>

<a href="<%=viewaddPageURL.toString()%>">Add Book</a>

<liferay-ui:search-container>
	<liferay-ui:search-container-results 
		results="<%= BookLocalServiceUtil.getBooks(searchContainer.getStart(), searchContainer.getEnd()) %>" 
	/>
	
	<liferay-ui:search-container-row
		className="com.proliferay.book.model.Book"
		modelVar="aBook"
	>
	<liferay-ui:search-container-column-text property="authorName" name="Author Name"/> 
	
	<liferay-ui:search-container-column-text property="bookName" name="Book Name"/> 
	
	<liferay-ui:search-container-column-text property="isbn" name="ISBN"/> 
	
	<liferay-ui:search-container-column-text property="price" name="Price"/> 
	
	<liferay-ui:search-container-column-jsp path="/book-portlet/actions.jsp" align="right"/>
	</liferay-ui:search-container-row>


<liferay-ui:search-iterator />

</liferay-ui:search-container>