package com.tianyalan.acyclicrelationships.callback.order;

import java.math.BigDecimal;

public interface DiscountCalculator {
	public BigDecimal getDiscountAmount();
}