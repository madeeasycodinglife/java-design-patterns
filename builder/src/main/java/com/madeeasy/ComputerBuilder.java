package com.madeeasy;

// Builder: ComputerBuilder
public class ComputerBuilder {
    private String cpu;
    private String ram;
    private String storage;
    private String gpu;

    // Setters for components
    public ComputerBuilder setCpu(String cpu) {
        this.cpu = cpu;
        return this;
    }

    public ComputerBuilder setRam(String ram) {
        this.ram = ram;
        return this;
    }

    public ComputerBuilder setStorage(String storage) {
        this.storage = storage;
        return this;
    }

    public ComputerBuilder setGpu(String gpu) {
        this.gpu = gpu;
        return this;
    }

    // Build method to create Computer object
    public Computer build() {
        return new Computer(cpu, ram, storage, gpu);
    }
}
