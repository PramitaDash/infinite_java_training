<%@page import="com.java.agent.AgentDAOImpl"%>
<%@page import="com.java.agent.AgentDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	int AgentID = Integer.parseInt(request.getParameter("AgentID"));
	AgentDAO dao = new AgentDAOImpl()	;
	dao.deleteAgentDao(AgentID);
%>
	<jsp:forward page="ShowAgent.jsp"/>

</body>
</html>