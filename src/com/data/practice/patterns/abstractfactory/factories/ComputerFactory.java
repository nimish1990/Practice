package com.data.practice.patterns.abstractfactory.factories;

import com.data.practice.patterns.abstractfactory.model.Computer;

public class ComputerFactory {

    public static Computer getComputer(ComputerAbstractFactory factory) {
        return factory.createComputer();
    }
}
