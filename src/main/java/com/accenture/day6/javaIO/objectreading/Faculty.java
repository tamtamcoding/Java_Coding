package com.accenture.day6.javaIO.objectreading;

public class Faculty {

    private int id;
    private String name, eid;

    public Faculty() {
        //empty constructor
    }

    public Faculty(int id, String name, String eid) {
        this.id = id;
        this.name = name;
        this.eid = eid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEid() {
        return eid;
    }

    public void setEid(String eid) {
        this.eid = eid;
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", eid='" + eid + '\'' +
                '}';
    }
}
