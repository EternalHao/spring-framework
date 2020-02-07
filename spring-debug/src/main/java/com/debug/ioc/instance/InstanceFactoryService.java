package com.debug.ioc.instance;

/**
 * 实例化工厂
 */
class ClientService{
	public ClientService(){
		System.out.println("clientService 初始化");
	}
}
class AccountService{
	public AccountService(){
		System.out.println("accountService 初始化");
	}
}

public class InstanceFactoryService {
	private static ClientService clientService = new ClientService();

	private static AccountService accountService = new AccountService();

	public ClientService createClientServiceInstance() {
		return clientService;
	}

	public AccountService createAccountServiceInstance() {
		return accountService;
	}
}
