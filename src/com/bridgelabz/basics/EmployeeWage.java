package com.bridgelabz.basics;

public class EmployeeWage {
    static final int EMPLOYEE_PRESENT = 1;
    static final int IS_PARTTIME = 4;
    static final int FULLDAYHOUR = 8;
    static final int FULLDAYWAGESPERHR = 20;

    public static void main(String[] args) {
        System.out.println("welcome to employee wages");
        double empCheck = Math.floor(Math.random() * 10) % 2;
        if (empCheck == EMPLOYEE_PRESENT) {
            System.out.println("employee is present");
            int dailyWages = FULLDAYHOUR * FULLDAYWAGESPERHR;
            System.out.println("Daily wages is=>" + dailyWages);
        } else {
            System.out.println("employee is absent");
        }
    }
}