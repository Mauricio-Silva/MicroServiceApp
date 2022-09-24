package br.edu.ifms.dsd_ms_worker_app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifms.dsd_ms_worker_app.model.Worker;
import br.edu.ifms.dsd_ms_worker_app.service.WorkerService;


@RestController
@RequestMapping(value = "/worker")
public class WorkerController {

    @Autowired
    private WorkerService workerService;
    
    @GetMapping(value = "/{id}")
    public ResponseEntity<Worker> getWorker(@PathVariable("id") int id) {
        Worker worker = this.workerService.getWorkerById(id);
        return ResponseEntity.ok(worker);
    }

    @GetMapping(value = "/{id}/salary")
    public ResponseEntity<Float> getWorkerSalary(@PathVariable("id") int id) {
        Worker worker = this.workerService.getWorkerById(id);
        return ResponseEntity.ok(worker.getSalary());
    }
}
