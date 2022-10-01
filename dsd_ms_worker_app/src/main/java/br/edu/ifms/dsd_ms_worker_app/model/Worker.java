package br.edu.ifms.dsd_ms_worker_app.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Worker {
    private Integer id;
    private String name;
    private double salary;
}
