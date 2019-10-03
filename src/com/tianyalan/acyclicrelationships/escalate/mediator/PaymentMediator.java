package com.tianyalan.acyclicrelationships.escalate.mediator;

import java.math.*;

import com.tianyalan.acyclicrelationships.escalate.account.Account;
import com.tianyalan.acyclicrelationships.escalate.order.Order;

public class PaymentMediator {
	private Account account;

	public PaymentMediator(Account account) {
		this.account = account;
	}

	public BigDecimal pay(Order order) {
		BigDecimal discount = new BigDecimal(1).subtract(this.account.getDiscountAmount());
		BigDecimal paidAmount = order.getChargeAmount().multiply(discount);
		
		//TODO:Ö´ÐÐÖ§¸¶
		return paidAmount;
	}	
}