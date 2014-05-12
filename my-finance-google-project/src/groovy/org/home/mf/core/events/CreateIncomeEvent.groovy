package org.home.mf.core.events;

import org.home.myfinance.core.domain.Income

public class CreateIncomeEvent{
  private Income income;
  private String status;
  private String statusMessage;

  public CreateIncomeEvent(Income income) {
    this.income = income;
  }

  public Income getIncome() {
    return income;
  }
  
  public void setStatusMessage(String statusMessage){
  	this.statusMessage = statusMessage;
  }
  
  public String getStatusMessage() {
      return statusMessage;
  }
  
  public void setStatus(String status){
    	this.status = status;
  }
  
  public String getStatus() {
      return status;
  }
  
  
}
