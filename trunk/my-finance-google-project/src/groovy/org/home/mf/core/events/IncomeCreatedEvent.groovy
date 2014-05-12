package org.home.mf.core.events;

import java.util.UUID;
import org.home.myfinance.core.domain.Income

public class IncomeCreatedEvent {

  private final Long newOrderKey;
  private final Income income;
  private final CreateIncomeEvent createIncomeEvent;

  public IncomeCreatedEvent(Long newOrderKey, final Income income, createIncomeEvent) {
    this.newOrderKey = newOrderKey;
    this.income = income;
    this.createIncomeEvent = createIncomeEvent;
  }

  public Income getIncome() {
      return income;
  }

  public Long getNewOrderKey() {
    return newOrderKey;
  }
}
