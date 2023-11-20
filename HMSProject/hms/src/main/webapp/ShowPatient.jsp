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
                <h2><h:outputText value="Patient List"/></h2>
            </center>
        <center>
        <h:dataTable value="#{patientDao.showPatientDao()}" var="e" border="5">
        	            	    <h:column>
        	           <f:facet name="header">
        	           		<h:outputText value="Patient Id" />
      	 	           </f:facet>
                    <h:outputText value="#{e.pid}"/>
                </h:column>
                    <h:column>
                     <f:facet name="header">
        	           		<h:outputText value="Patient Name" />
        	           </f:facet>
                    <h:outputText value="#{e.name}"/>
                </h:column>
                    <h:column>
                    <f:facet name="header">
        	           		<h:outputText value="Age" />
        	           </f:facet>
                    <h:outputText value="#{e.age}"/>
                </h:column>
                <h:column>
                    <f:facet name="header">
        	           		<h:outputText value="weight" />
        	           </f:facet>
                    <h:outputText value="#{e.weight}"/>
                </h:column>
                <h:column>
                    <f:facet name="header">
        	           		<h:outputText value="gender" />
        	           </f:facet>
                    <h:outputText value="#{e.gender}"/>
                </h:column>
                <h:column>
                    <f:facet name="header">
        	           		<h:outputText value="address" />
        	           </f:facet>
                    <h:outputText value="#{e.address}"/>
                </h:column>
                <h:column>
                    <f:facet name="header">
        	           		<h:outputText value="phoneno" />
        	           </f:facet>
                    <h:outputText value="#{e.phoneno}"/>
                </h:column>
                <h:column>
                    <f:facet name="header">
        	           		<h:outputText value="disease" />
        	           </f:facet>
                    <h:outputText value="#{e.disease}"/>
                </h:column>
                <h:column>
                    <f:facet name="header">
        	           		<h:outputText value="doctor_id" />
        	           </f:facet>
                    <h:outputText value="#{e.doctor_id}"/>
                </h:column>
        </h:dataTable>
        </h:form>
        </center>
    </body>
</html>
</f:view>