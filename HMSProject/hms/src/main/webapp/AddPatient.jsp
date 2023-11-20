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
        <center>
		<h2>
	<h:outputText value="Add Patient" />
	</h2>
	<h:form id="form">
	<h:outputText value="Patient Id " />
	<h:inputText  value="#{patient.pid}" /><br/> 
	<br/><br/>
	<h:outputText value="Patient Name " />
	<h:inputText  value="#{patient.name}" /><br/>
	
		<br><br>
	<h:outputText value="Patient Age" />
	<h:inputText  value="#{patient.age}" /><br/>
	
	    <br><br>
	<h:outputText value="Weight " />
	<h:inputText  value="#{patient.weight}" /><br/>
		<br><br>
	<h:outputText value="Patient gender " />
	<h:inputText  value="#{patient.gender}" /><br/>
	<br/><br/>
	<h:outputText value="Patient address " />
	<h:inputText  value="#{patient.address}" /><br/>
	<br/><br/>
	<h:outputText value="Patient phoneno " />
	<h:inputText  value="#{patient.phoneno}" /><br/>
	<br/><br/>
	<h:outputText value="Patient disease " />
	<h:inputText  value="#{patient.disease}" /><br/>
	<br/><br/>
	<h:outputText value="Patient doctor_id " />
	<h:inputText value="#{patient.doctor_id}" /><br/>
	<br/><br/>
	<h:commandButton action="#{patientDao.addPatientDao(patient)}" value="Add Patient" />
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	<h:commandButton type="reset" value="Reset"></h:commandButton>
	
	</h:form>
</center>
    </body>
</html>

</f:view>