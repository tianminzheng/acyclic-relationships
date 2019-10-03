package com.tianyalan.acyclicrelationships.escalate.account;

import java.util.*;

import com.tianyalan.acyclicrelationships.escalate.order.Order;

import java.math.BigDecimal;

public class Account {
	private List<Order> orders;

	public BigDecimal getDiscountAmount() {
		if (orders.size() > 5) {
			return new BigDecimal(0.1);
		} else {
			return new BigDecimal(0.03);
		}
	}

	public List<Order> getOrders() {
		return this.orders;
	}

	public void createOrder(BigDecimal chargeAmount) {
		Order order = new Order(chargeAmount);
		if (orders == null) {
			orders = new ArrayList<Order>();
		}
		orders.add(order);
	}

}
