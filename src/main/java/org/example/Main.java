package org.example;

import org.example.enums.Plan;

public class Main {

    public static void main(String[] args) {
        runApplication();
    }

    public static void runApplication() {

        Healthplan healthplan = new Healthplan(
                1,
                "Basic Health",
                Plan.BASIC
        );

        System.out.println("----- HEALTHPLAN -----");
        System.out.println(healthplan.toString());


        String[] healthplans = new String[3];

        Employee employee = new Employee(
                1,
                "Ahmet Emir",
                "ahmet@example.com",
                "123456",
                healthplans
        );

        employee.addHealthPlan(0, "BASIC");
        employee.addHealthPlan(1, "PREMIUM");

        System.out.println("----- EMPLOYEE -----");
        System.out.println(employee.toString());


        String[] developers = new String[3];

        Company company = new Company(
                1,
                "Software Company",
                50000,
                developers
        );

        company.addEmployee(0, "Ahmet Emir");
        company.addEmployee(1, "Mehmet");

        System.out.println("----- COMPANY -----");
        System.out.println(company.toString());


        System.out.println("----- ENCAPSULATION TEST -----");

        company.setGiro(75000);
        System.out.println("Company giro: " + company.getGiro());

        try {
            company.setGiro(-1000);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Final giro: " + company.getGiro());
    }
}