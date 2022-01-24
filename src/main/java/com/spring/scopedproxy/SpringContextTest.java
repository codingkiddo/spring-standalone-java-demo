package com.spring.scopedproxy;

import org.springframework.aop.framework.ProxyFactory;

interface Account {
	Double getBalance();
}

class AccountImpl implements Account {
	public Double getBalance() {
		return 100.50;
	}
}

public class SpringContextTest {
	public static void main(String[] args) {
//		Account account = new AccountImpl();
//		System.out.println(String.format("Object Class: [ %s] ", account.getClass().getCanonicalName()));
//		System.out.println(String.format("Account balance: [ %.2f €]", account.getBalance()));

//		 ProxyFactory is a class that can be used for programmatic creation of AOP
//		 proxies.
//		 We create a proxy that delegates behavior in AccountImpl
		ProxyFactory factory = new ProxyFactory(new AccountImpl());
		factory.addInterface(Account.class);

//		 Using the factory we can get a proxy
		Account account = (Account) factory.getProxy();

		System.out.println(String.format("Object Class: [ %s] ", account.getClass().getCanonicalName()));
		System.out.println(String.format("Account balance: [ %.2f € ]", account.getBalance()));
	}

}
