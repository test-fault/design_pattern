package com.other.prototype;

public class ComputerDetail implements Cloneable {
    private String cpu;
    private String memory;
    private Disk disk;

    public ComputerDetail(String cpu, String memory, Disk disk) {
        this.cpu = cpu;
        this.memory = memory;
        this.disk = disk;
    }

    public Object clone() {
        try {
            ComputerDetail computerDetail = (ComputerDetail) super.clone();
            computerDetail.disk = (Disk) this.disk.clone();
            return computerDetail;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
