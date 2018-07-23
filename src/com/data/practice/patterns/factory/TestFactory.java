package com.data.practice.patterns.factory;

public class TestFactory {

    public static void main(String args[]) {

        Computer pc = ComputerFactory.getComputer(ComputerType.PC, "16GB", "1TB", "intex amd processer");
        Computer server = ComputerFactory.getComputer(ComputerType.SERVER, "128GB", "10TB", "intex core i7 processer");

        System.out.println("Factory PC Config::" + pc);
        System.out.println("Factory Server Config::" + server);

    }
}
