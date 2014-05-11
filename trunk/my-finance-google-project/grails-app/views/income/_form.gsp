<%@ page import="org.home.myfinance.core.domain.Income" %>

<div class="fieldcontain ${hasErrors(bean: incomeInstance, field: 'incomeName', 'error')} required">
	<label for="incomeName">
		<g:message code="income.incomeName.label" default="Income Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="incomeName" required="" value="${incomeInstance?.incomeName}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: incomeInstance, field: 'displayName', 'error')} required">
	<label for="displayName">
		<g:message code="income.displayName.label" default="Display Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="displayName" required="" value="${incomeInstance?.displayName}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: incomeInstance, field: 'description', 'error')} required">
	<label for="description">
		<g:message code="income.description.label" default="Description" />
		<span class="required-indicator">*</span>
	</label>
	<g:textArea name="description" value="${incomeInstance?.description}"/>

</div>
