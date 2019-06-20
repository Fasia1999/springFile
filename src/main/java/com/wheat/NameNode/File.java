package com.wheat.NameNode;

import java.util.Date;

public class File implements Comparable{
    private int id;
    private String name;
    private int blocks;
    private int pos[];
    private Date last_modify_time;

    public File() {
        this.id = -1;
        this.name = "";
        this.blocks = 0;
        this.pos = new int [1];
    }

    @Override
    public int compareTo(Object o) {
        File f = (File) o;
        return id - f.id;
    }

    public int getBlocks() {
        return blocks;
    }

    public void setBlocks(int blocks) {
        this.blocks = blocks;
    }

    public int[] getPos() {
        return pos;
    }

    public void setPos(int[] pos) {
        this.pos = pos;
    }

    public File(int id, String name, int rep, Date last_modify_time) {
        this.id = id;
        this.name = name;
        this.blocks = rep;
        this.pos = new int [rep];
        this.last_modify_time = last_modify_time;
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

    public Date getLast_modify_time() {
        return last_modify_time;
    }

    public void setLast_modify_time(Date last_modify_time) {
        this.last_modify_time = last_modify_time;
    }

    @Override
    public String toString() {
        return this.getClass().getName() + "{id = " + id + "; name = " + name + "}";
    }

}
