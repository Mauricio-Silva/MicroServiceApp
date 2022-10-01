package br.edu.ifms.dsd_ms_payroll_app.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.edu.ifms.dsd_ms_payroll_app.model.Payroll;


@Service
public class PayrollService {

    // final private RestTemplate restTemplate;
    // public PayrollService(RestTemplate restTemplate) {
    //     this.restTemplate = restTemplate;
    // }


    // @Autowired
    // private RestTemplate restTemplate;

    @Value("${ms-worker.url}")
    private String baseUrl;


    // public Payroll makePayroll(int id, int days) {
    //     Payroll payroll = new Payroll();
    //     String url = baseUrl + "/worker/{id}/salary";
    //     Map<String, String> params = new HashMap<>();
    //     params.put("id", String.valueOf(id));
    //     Double salary = restTemplate.getForObject(url,double.class, params);
    //     payroll.setOriginalSalary(salary);
    //     payroll.setDays(days);
    //     return payroll;
    // }   

    @Autowired
    final private WorkerInterface workerInterface;

    public Payroll makePayroll(int id, int days) {
        Payroll payroll = new Payroll();
        String url = baseUrl + "/worker/{id}/salary";
        Map<String, String> params = new HashMap<>();
        params.put("id", String.valueOf(id));
        Double salary = restTemplate.getForObject(url,double.class, params);
        payroll.setOriginalSalary(salary);
        payroll.setDays(days);
        return payroll;
    }   
}
