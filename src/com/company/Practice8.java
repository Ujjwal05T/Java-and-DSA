package com.company;

class Employees {
    int salary;
    String name;
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }
}
public class Practice8 {
    public static void main(String[] args) {
        Employees ujjwal = new Employees();
        ujjwal.name = "Ujjwal Tamrakar";
        ujjwal.salary = 200000;
        System.out.println(ujjwal.getName());
        System.out.println(ujjwal.getSalary());
        ujjwal.setName("Satyam Kourav");
        System.out.println(ujjwal.getName());
    }
}
