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
         <h2 style="text-align: center" class="col-sm-4">Add Your Record</h2>
            <hr/>
Report ID
                    <h:inputText id="reportId" value="#{patientReport.reportId}" /> <br/>
Patient ID
                    <h:inputText id="pid" value="#{patientReport.pid}" /> <br/>

TestCode 
                    <h:inputText id="testCode" value="#{patientReport.testCode}" /> <br/>
TestName
                    <h:inputText id="testName" value="#{patientReport.testName}" /> <br/>
Test Description
                    <h:inputText id="testDescription" value="#{patientReport.testDescription}"/> <br/>
Cost
					<h:inputText id="cost" value="#{patientReport.cost}"/> <br/>
Comments
					<h:inputText id="comments" value="#{patientReport.comments}"/> <br/>

                    <h:commandButton value="Insert" 
				 	action="#{ejbImpl.addPatientReport(patientReport)}" />
        
        </h:form>
    </body>
</html>
</f:view>