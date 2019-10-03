package com.tianyalan.acyclicrelationships.demote.account;

import java.util.*;
import java.math.BigDecimal;

import com.tianyalan.acyclicrelationships.demote.calculator.DiscountCalculator;
import com.tianyalan.acyclicrelationships.demote.order.Order;

public class Account {
	private List<Order> orders;

	public List<Order> getOrders() {
		return this.orders;
	}

	public DiscountCalculator getDiscountCalculator() {
		return new DiscountCalculator(new Integer(orders.size()));
	}

	public void createBill(BigDecimal chargeAmount) {
		Order bill = new Order(chargeAmount);
		if (orders == null) {
			orders = new ArrayList<Order>();
		}
		orders.add(bill);
	}

}
