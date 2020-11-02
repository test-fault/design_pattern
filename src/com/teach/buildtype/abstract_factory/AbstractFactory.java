package com.teach.buildtype.abstract_factory;

public abstract class AbstractFactory {
    public abstract Phone createPhone(String brand);

    public abstract Computer createComputer(String brand);
}
