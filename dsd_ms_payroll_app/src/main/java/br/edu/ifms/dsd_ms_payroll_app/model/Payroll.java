package br.edu.ifms.dsd_ms_payroll_app.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payroll {

    private Double originalSalary;
    private Double salary;    
    private int days;
    private Double aliquot = 0.03;


    public void makeSalary() {
        this.salary = this.originalSalary + (this.days * (this.originalSalary * this.aliquot));
    }
}
