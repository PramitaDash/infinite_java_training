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
                <h2><h:outputText value="Room List"/></h2>
            </center>
        <center>
        <h:dataTable value="#{roomDao.showRoomDao()}" var="e" border="5">
        	            	    <h:column>
        	           <f:facet name="header">
        	           		<h:outputText value="Doctor Id" />
      	 	           </f:facet>
                    <h:outputText value="#{e.room_no}"/>
                </h:column>
                    <h:column>
                     <f:facet name="header">
        	           		<h:outputText value="Doctor Name" />
        	           </f:facet>
                    <h:outputText value="#{e.room_type}"/>
                </h:column>
        </h:dataTable>
        </h:form>
        </center>
    </body>
</html>
</f:view>