package com.dmd.oop.lesson7;

public class Computer {
    private Ram ram;
    private Ssd ssd;
    private static int count =0;

    public Computer(Ram ram, Ssd ssd) {
        this.ram = ram;
        this.ssd = ssd;
        count++;
    }
    public static int getCount(){
        return count;
    }

    public void printState() {
        System.out.println("Computer: ram " + ram.getValue()+", ssd "+ ssd.getValue());
    }
}
