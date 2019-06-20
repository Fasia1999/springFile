package com.wheat.NameNode;

import java.util.ArrayList;
import java.util.List;

public class FileManager {
    private int filenum;
    private int blocksize;//拆分块大小
    private int replicas;//复制份数
    private List<File> filelist;

    public FileManager() {
        this.filenum = 0;
        this.blocksize = 0;
        this.replicas = 0;
        this.filelist = new ArrayList<>();
    }

    public FileManager(int fn, int bs, int rep) {
        this.filenum = fn;
        this.blocksize = bs;
        this.replicas = rep;
        this.filelist = new ArrayList<>();
    }

    public int getFilenum() {
        return filenum;
    }

    public void setFilenum(int filenum) {
        this.filenum = filenum;
    }

    public List<File> getFilelist() {
        return filelist;
    }

    public void setFilelist(List<File> filelist) {
        this.filelist = filelist;
    }

    public int getBlocksize() {
        return blocksize;
    }

    public void setBlocksize(int blocksize) {
        this.blocksize = blocksize;
    }

    public int getReplicas() {
        return replicas;
    }

    public void setReplicas(int replicas) {
        this.replicas = replicas;
    }
}
