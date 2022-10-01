package br.edu.ifms.dsd_ms_worker_app.interface;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClients(name = "ms-worker", url = "localhost:8001")
public interface WorkerInterface {
    @GetMapping(value = "/{id}/salary")
    public ResponseEntity<Double> getWorkerSalary(@PathVariable("id") int id) {
    }    
}
