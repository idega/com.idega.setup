<?xml version="1.0" encoding="UTF-8"?>
<jsp:root version="1.2" 
	xmlns:f="http://java.sun.com/jsf/core" 	
	xmlns:h="http://java.sun.com/jsf/html" 	
	xmlns:jsp="http://java.sun.com/JSP/Page" 	
	xmlns:iwc="http://xmlns.idega.com/com.idega.core" 
>
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
    		<iwc:page id="setup1">
    			<h:form>
				<h:outputText value="The Application has no database configured. Please set up a JNDI DataSource undir jdbc/DefaultDS configure db.properties"/>
			</h:form>
		</iwc:page>
    </f:view>
</jsp:root>