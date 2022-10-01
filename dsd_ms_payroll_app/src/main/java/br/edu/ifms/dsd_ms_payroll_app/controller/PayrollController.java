package br.edu.ifms.dsd_ms_payroll_app.controller;

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

    final private PayrollService payrollService;

    public PayrollController(PayrollService payrollService) {
        this.payrollService = payrollService;
    }

    @GetMapping(value = "/days/{days}/workerId/{id}")
    public ResponseEntity<Payroll> getPayroll (@PathVariable Integer days, @PathVariable Integer id) {
        Payroll payroll = payrollService.makePayroll(id, days);
        payroll.makeSalary();
        return ResponseEntity.ok(payroll);
    }
}
