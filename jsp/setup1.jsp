<?xml version="1.0" encoding="UTF-8"?>
<jsp:root version="1.2" 
	xmlns:f="http://java.sun.com/jsf/core" 	
	xmlns:h="http://java.sun.com/jsf/html" 	
	xmlns:jsp="http://java.sun.com/JSP/Page" 	
	xmlns:wf="http://xmlns.idega.com/com.idega.webface" 
>
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
    		<wf:workspace_page id="setup1">
    			<h:form>
				<h:outputText value="The Application has no database configured. Please configure db.properties"/>
			</h:form>
		</wf:workspace_page>
    </f:view>
</jsp:root>