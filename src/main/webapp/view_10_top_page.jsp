<%@page import="java.util.Date"%>
<%@page import="org.riversun.string_grabber.StringGrabber"%>
<%@page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8" session="true"%>
<%@page import="java.util.Calendar"%>
<%@page import="java.net.URLEncoder"%>
<%@page import="webapp.models.PersonInfo"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<!doctype html>
<html>

<!-- example for query param "title" usage -->
<c:if test="${empty param.title}">
	<c:set var="title_name" value="Top Page" />
</c:if>

<c:if test="${!empty param.title }">
	<c:set var="title_name" value="${param.title}" />
</c:if>


<c:set var="header_title" value="${title_name}" scope="request"></c:set>
<c:set var="body_class" value="top" scope="request"></c:set>
<c:import url="include_00_header.jsp" charEncoding="UTF-8" />
<script>
	
</script>

<div style="text-align: left; background-color: #f0f0f0">
	<strong>You have completed the above training topics <jsp:useBean id="today"
			class="java.util.Date" scope="page" /> <fmt:formatDate
			value="${today}" pattern="E MM/dd/yyyy" /> But, do not forgot to do the hands-on :-)
	</strong>
</div>
<c:choose>
	<c:when
		test="${!empty sessionScope.SESSION_KEY_IS_USER_LOGGED_IN && sessionScope.SESSION_KEY_IS_USER_LOGGED_IN==true}">
	</c:when>
</c:choose>


<!-- <%@ include file="include_01_footer.jsp"%> --> 

</body>
</html>
