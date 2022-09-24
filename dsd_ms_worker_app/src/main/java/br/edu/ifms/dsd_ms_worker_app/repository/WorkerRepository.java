package br.edu.ifms.dsd_ms_worker_app.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import br.edu.ifms.dsd_ms_worker_app.model.Worker;


@Repository
public class WorkerRepository {
    // cSpell:disable
    private List<Worker> workers = new ArrayList<Worker>() {{ 
        add(new Worker(1, "Mauricio", 1500));
        add(new Worker(2, "Deivison", 2000));
        add(new Worker(3, "Luiz", 1700));
        add(new Worker(4, "Toshiba", 3000));
        add(new Worker(5, "Sthefany", 1600));
    }};
    //cSpell:enable
    private List<Integer> workersIds = workers.stream().map(Worker::getId).collect(Collectors.toList());

    public Worker getById(int id) {
        if (workersIds.contains(id)) {
            Integer position = workersIds.indexOf(id);
            return workers.get(position);
        }
        return null;
    }
}
