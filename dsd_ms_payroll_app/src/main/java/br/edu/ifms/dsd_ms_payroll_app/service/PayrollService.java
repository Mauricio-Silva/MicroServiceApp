package br.edu.ifms.dsd_ms_payroll_app.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import br.edu.ifms.dsd_ms_payroll_app.interfaces.WorkerInterface;
import br.edu.ifms.dsd_ms_payroll_app.model.Payroll;


@Service
public class PayrollService {

    final private WorkerInterface workerInterface;

    @Value("${ms-worker.url}")
    private String baseUrl;

    public PayrollService(WorkerInterface workerInterface) {
        this.workerInterface = workerInterface;
    }


    public Payroll makePayroll(int id, int days) {
        Payroll payroll = new Payroll();
        Double salary = workerInterface.getWorkerSalary(id).getBody();
        payroll.setOriginalSalary(salary);
        payroll.setDays(days);
        return payroll;
    }
}
