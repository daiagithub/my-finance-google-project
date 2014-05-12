
<%@ page import="org.home.myfinance.core.domain.Income" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'income.label', default: 'Income')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-income" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-income" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
						<g:sortableColumn property="displayName" title="${message(code: 'income.displayName.label', default: 'Display Name')}" />
					
					
						<g:sortableColumn property="description" title="${message(code: 'income.description.label', default: 'Description')}" />
					
						<g:sortableColumn property="dateCreated" title="${message(code: 'income.dateCreated.label', default: 'Date Created')}" />
					
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${incomeInstanceList}" status="i" var="incomeInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${incomeInstance.id}">${fieldValue(bean: incomeInstance, field: "displayName")}</g:link></td>
					
					
						<td>${fieldValue(bean: incomeInstance, field: "description")}</td>
					
						<td><g:formatDate date="${incomeInstance.dateCreated}" /></td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${incomeInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
