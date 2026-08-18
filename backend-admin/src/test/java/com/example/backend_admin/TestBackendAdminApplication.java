package com.example.backend_admin;

import org.springframework.boot.SpringApplication;

public class TestBackendAdminApplication {

	public static void main(String[] args) {
		SpringApplication.from(BackendAdminApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
