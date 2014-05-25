package org.home.mf.core.services

import grails.transaction.Transactional
import org.home.mf.core.events.*
import org.home.myfinance.core.domain.User
import org.home.mf.core.persistence.*

@Transactional
class IncomeService {
	def springSecurityService
     def incomePersistenceService;
    
      public IncomeService(){}
    
      @Override
      public IncomeCreatedEvent createIncome(CreateIncomeEvent createIncomeEvent) {
    
        //TODO, add validation of menu items
        //TODO, add order total calculation
        //TODO, add order time estimate calculation
    	//TODO  Think transaction boundary. Order and OrderStatus should be atomic
    	println "Income Service..."
    	        
    	createIncomeEvent.income.setUser(springSecurityService.currentUser)
    	createIncomeEvent.income.setCreatedBy(springSecurityService.currentUser.username)
    	createIncomeEvent.income.setLastUpdatedBy(springSecurityService.currentUser.username)
    	
    	createIncomeEvent.income.validate()
    	if (createIncomeEvent.income.hasErrors()) {
		        	println "Got errors..."
		           createIncomeEvent.status="ERROR"
		            createIncomeEvent.setStatusMessage("Income could not be created due to errors")
		            return new IncomeCreatedEvent(null, createIncomeEvent.income, createIncomeEvent);
		            
        }
        
        IncomeCreatedEvent event = incomePersistenceService.createIncome(createIncomeEvent);
    	return event;
      }
    
}

