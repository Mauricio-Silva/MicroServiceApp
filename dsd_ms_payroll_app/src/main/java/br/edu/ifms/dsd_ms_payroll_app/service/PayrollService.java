package br.edu.ifms.dsd_ms_payroll_app.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class PayrollService {

    final private RestTemplate restTemplate;

    public PayrollService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }
}
