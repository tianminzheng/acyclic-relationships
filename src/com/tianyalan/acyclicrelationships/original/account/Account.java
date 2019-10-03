package com.tianyalan.acyclicrelationships.original.account;

import java.util.*;

import com.tianyalan.acyclicrelationships.original.order.Order;

import java.math.BigDecimal;

public class Account {
	private List<Order> orders;

	public BigDecimal getDiscountAmount() {
		//�����˺��µĶ�������ģ���ۿ�����
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
		Order order = new Order(this, chargeAmount);
		if (orders == null) {
			orders = new ArrayList<Order>();
		}
		orders.add(order);
	}
}
