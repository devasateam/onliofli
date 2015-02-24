package com.arch;

import com.accounts.service.AuthenticationService;
import com.accounts.service.AuthenticationServiceImpl;
import com.accounts.service.CategoryService;
import com.accounts.service.CategoryServiceImpl;
import com.architecture.annotations.Bean;

/**
 * @Author Pramod Email:sendpramod@gmail.com
 */
public class ServiceContainer {
	private static ServiceContainer serviceContainer = null;

	private ServiceContainer() {
	}

	public synchronized static ServiceContainer getInstance() {
		if (serviceContainer == null) {
			serviceContainer = new ServiceContainer();
		}
		return serviceContainer;
	}

	@Bean
	public CategoryService getCategoryService() {
		return new CategoryServiceImpl();
	}

	@Bean
	public AuthenticationService getAuthenticationService() {
		return new AuthenticationServiceImpl();
	}

}
