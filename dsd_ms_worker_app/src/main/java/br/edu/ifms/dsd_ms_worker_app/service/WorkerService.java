package br.edu.ifms.dsd_ms_worker_app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ifms.dsd_ms_worker_app.model.Worker;
import br.edu.ifms.dsd_ms_worker_app.repository.WorkerRepository;


@Service
public class WorkerService {

    @Autowired
    private WorkerRepository workerRepository;

    public Worker getWorkerById(int id) {
        return this.workerRepository.getById(id);
    }
}
