package com.tianyalan.acyclicrelationships.demote.order;

import java.math.BigDecimal;

import com.tianyalan.acyclicrelationships.demote.calculator.DiscountCalculator;

public class Order {

	private BigDecimal chargeAmount;

	public Order(BigDecimal chargeAmount) {
		this.chargeAmount = chargeAmount;
	}

	public BigDecimal getChargeAmount() {
		return this.chargeAmount;
	}

	public BigDecimal pay(DiscountCalculator discountCalculator) {
		BigDecimal discount = new BigDecimal(1).subtract(discountCalculator.getDiscountAmount()).setScale(2,
				BigDecimal.ROUND_HALF_UP);
		BigDecimal paidAmount = this.chargeAmount.multiply(discount).setScale(2);
		
		//TODO:Ö´ÐÐÖ§¸¶
		return paidAmount;
	}

}