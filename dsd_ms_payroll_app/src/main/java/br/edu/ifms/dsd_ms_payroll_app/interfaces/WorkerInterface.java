package br.edu.ifms.dsd_ms_payroll_app.interfaces;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(name = "ms-worker", url = "${ms-worker.url}")
public interface WorkerInterface {

    @GetMapping("/{id}/salary")
    ResponseEntity<Double> getWorkerSalary (@PathVariable Integer id);
}
