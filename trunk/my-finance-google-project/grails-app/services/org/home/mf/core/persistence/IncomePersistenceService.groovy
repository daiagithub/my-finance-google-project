package org.home.mf.core.persistence

import org.home.mf.core.events.*
import org.home.myfinance.core.domain.Income

import grails.transaction.Transactional

@Transactional
class IncomePersistenceService {

      public IncomePersistenceService(){}
      
      @Override
      public IncomeCreatedEvent createIncome(CreateIncomeEvent createIncomeEvent) {
        Income income = createIncomeEvent.getIncome()
    
        income.save flush:true
        
        createIncomeEvent.status="SUCCESS"
        createIncomeEvent.statusMessage="Successfully created."
        return new IncomeCreatedEvent(income.getId(), income, createIncomeEvent);
      }
    
      
}
