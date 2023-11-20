<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%> 
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%> 

<f:view>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <h:form>
    <center>
    	<h2><h:outputText value=" Update Provider Details"/></h2><br>
    	
    	Provider Id:
    	<h:inputText id="providerid" value="#{editProvider.providerid}"/>&nbsp;&nbsp;
    	
    	Name:
    	<h:inputText id="name" value="#{editProvider.name}"/><br><br>
    	
    	Email:
    	<h:inputText id="email" value="#{editProvider.email}"/><br><br>
    	
    	Username:
    	<h:inputText id="username" value="#{editProvider.username}"/><br><br>
    	
    	Phoneno:
    	<h:inputText id="phoneno" value="#{editProvider.phoneno}"/><br><br>
    	
    	Gender : <h:selectOneMenu id="genedr" value="#{editProvider.gender}">
    	<f:selectItem itemValue="MALE" itemLabel="MALE"/>
    	<f:selectItem itemValue="FEMALE" itemLabel="FEMALE"/>
    	</h:selectOneMenu><BR><BR>
    	
    	Specialty:
    	<h:inputText id="specialty" value="#{editProvider.specialty}"/><br><br>
    	
    	Type: <h:selectOneMenu id="type" value="#{editProvider.type}">
    	<f:selectItem itemValue="DOCTOR" itemLabel="DOCTOR"/>
    	<f:selectItem itemValue="OWNER" itemLabel="OWNER"/>
    	</h:selectOneMenu>
    	
    	Address :
    	<h:inputText id="address" value="#{editProvider.address}"/><br><br>
    	
    	<h:commandButton action="ShowProviderDetails" value="All Provider"/> &nbsp;
    	<h:commandButton action="#{pDao.updateProviderDetails(editProvider)}" value="updated"/>
    	
    </center>
    </h:form>
    	

</body>
</html>
</f:view>