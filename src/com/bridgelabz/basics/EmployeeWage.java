package com.bridgelabz.basics;

public class EmployeeWage {
    static  final int EMPLOYEE_PRESENT=1;

    public static void main(String[] args) {
        System.out.println("welcome to employee wages");
        double empCheck=Math.floor(Math.random()*10) % 2;
        if(empCheck==EMPLOYEE_PRESENT) {
            System.out.println("employee is present");
        }
        else {
            System.out.println("employee is absent");
    }
}
