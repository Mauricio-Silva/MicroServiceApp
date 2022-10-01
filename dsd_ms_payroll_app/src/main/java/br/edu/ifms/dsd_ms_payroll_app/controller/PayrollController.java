package br.edu.ifms.dsd_ms_payroll_app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifms.dsd_ms_payroll_app.model.Payroll;
import br.edu.ifms.dsd_ms_payroll_app.service.PayrollService;

@RestController
@RequestMapping(value = "/payroll")
public class PayrollController {
    
    @Autowired
    private PayrollService payrollService;

    @GetMapping(value = "/days/{days}/workerId/{id}")
    public ResponseEntity<Payroll> what(@PathVariable("days") int days, @PathVariable("id") int id) {
        Payroll payroll = payrollService.makePayroll(id, days);
        payroll.makeSalary();
        return ResponseEntity.ok(payroll);
    }
}
