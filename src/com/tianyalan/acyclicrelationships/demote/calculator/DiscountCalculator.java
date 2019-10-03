package com.tianyalan.acyclicrelationships.demote.calculator;

import java.math.*;

public class DiscountCalculator {
	private Integer orderNums;

	public DiscountCalculator(Integer orderNums) {
		this.orderNums = orderNums;
	}

	public BigDecimal getDiscountAmount() {
		if (orderNums.intValue() > 5) {
			return new BigDecimal(0.1);
		} else {
			return new BigDecimal(0.03);
		}
	}
}