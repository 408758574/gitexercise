package com.in.action;

public class Data {
    private int n;
    private int m;
    public int getN() {
        return n;
    }
    public void setN(int n) {
        this.n = n;
    }
    public int getM() {
        return m;
    }
    public void setM(int m) {
        this.m = m;
    }
    public Data(int n, int m) {
        super();
        this.n = n;
        this.m = m;
    }
    public Data() {
        super();
    }
    @Override
    public String toString(){
        int r=n/m;
        return n+"/" + m + "=" + r;
    }
}
