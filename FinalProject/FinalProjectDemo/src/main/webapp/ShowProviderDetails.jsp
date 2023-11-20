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
    <h2><h:outputText value="Provider Details"/></h2>

	<h:dataTable value="#{pDao.showProviderDetails()}" var="p" border="3">
	<h:column>
                  	 <f:facet name="header">
                    	<h:outputLabel value="Provider Id" />
                    </f:facet>
                    <h:outputText value="#{p.providerid}"/>
     </h:column>
     <h:column>
                    <f:facet name="header">
                    	<h:outputLabel value="Provider Name" />
                    </f:facet>
                    <h:outputText value="#{p.name}"/>
     </h:column>
     <h:column>
                    <f:facet name="header">
                    	<h:outputLabel value="Email" />
                    </f:facet>
                    <h:outputText value="#{p.email}"/>
     </h:column>
     <h:column>
                    <f:facet name="header">
                    	<h:outputLabel value="Username" />
                    </f:facet>
                    <h:outputText value="#{p.username}"/>
     </h:column>
     <h:column>
                    <f:facet name="header">
                    	<h:outputLabel value="Phone number" />
                    </f:facet>
                    <h:outputText value="#{p.phoneno}"/>
     </h:column>
     <h:column>
     		<f:facet name="header">
     		<h:outputLabel value="Gender"/>
     		</f:facet>
     		<h:outputText value="#{p.gender}"/>
      </h:column>
      <h:column>
                    <f:facet name="header">
                    	<h:outputLabel value="Specialty" />
                    </f:facet>
                    <h:outputText value="#{p.specialty}"/>
      </h:column>	
      			<f:facet name="header">
      			<h:outputLabel value="Type"/>
      			</f:facet>
      			<h:outputLabel value="#{p.type}"/>
      <h:column>
                    <f:facet name="header">
                   	<h:outputLabel value="Address" />
                    </f:facet>
                    <h:outputText value="#{p.address}"/>
      </h:column>
       <h:column>
	      <f:facet name = "header">

	      </f:facet>
	      <h:commandButton action = "#{pDao.searchProviderDetails(p.providerid)}" 
	      value = "Update"></h:commandButton>
	    </h:column>
	</h:dataTable>
    </center>
    </h:form>
    </body>
    </html>
    </f:view>