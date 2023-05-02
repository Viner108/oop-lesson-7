package com.dmd.oop.lesson9;

import com.dmd.oop.lesson7.Computer;

public class StaticRunner {
    public static void main(String[] args) {
        new Computer(null,null);
        new Computer(null,null);
        new Computer(null,null);
        new Computer(null,null);
        Computer computer = new Computer(null,null);
        Computer computer2=new Computer(null,null);
        System.out.println(Computer.getCount());

        Class<? extends Computer> clazz=computer.getClass();
        Class<? extends Computer> clazz2=computer2.getClass();
        System.out.println(clazz == clazz2);
        System.out.println(computer==computer2);
    }
}
