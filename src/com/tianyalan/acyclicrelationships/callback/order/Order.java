package com.tianyalan.acyclicrelationships.callback.order;

import java.math.BigDecimal;

public class Order {

	private BigDecimal chargeAmount;
	private DiscountCalculator discounter;

	public Order(DiscountCalculator discounter, BigDecimal chargeAmount) {
			this.discounter = discounter;
			this.chargeAmount = chargeAmount;
	}
	
	public BigDecimal getChargeAmount() {
		return this.chargeAmount;
	}

	public BigDecimal pay() {
		BigDecimal discount = new BigDecimal(1).subtract(this.discounter.getDiscountAmount());
		BigDecimal paidAmount = this.chargeAmount.multiply(discount);
		
		//TODO:Ö´ÐÐÖ§¸¶
		return paidAmount;
	}
}