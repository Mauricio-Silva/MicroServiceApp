package br.edu.ifms.dsd_ms_payroll_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class DsdMsPayrollAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(DsdMsPayrollAppApplication.class, args);
	}

}
