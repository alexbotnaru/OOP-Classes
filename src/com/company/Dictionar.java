package com.company;

public class Dictionar {
    private String tipul;
    private int editia;
    private int nrPag;
    private String limba;
    private double pret;

    public Dictionar(String tipul, int editia, int nrPag, String limba,double pret) {
        this.tipul = tipul;
        this.editia = editia;
        this.nrPag = nrPag;
        this.limba = limba;
        this.pret = pret;
    }

    public String getTipul() {
        return tipul;
    }

    public void setTipul(String tipul) {
        this.tipul = tipul;
    }

    public int getEditia() {
        return editia;
    }

    public void setEditia(int editia) {
        this.editia = editia;
    }

    public int getNrPag() {
        return nrPag;
    }

    public void setNrPag(int nrPag) {
        this.nrPag = nrPag;
    }

    public String getLimba() {
        return limba;
    }

    public void setLimba(String limba) {
        this.limba = limba;
    }

    public double getPret() {
       return pret;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    public String print(){
        return "Tipul: " + this.tipul + "\n" +
                "Editia: " + this.editia + "\n" +
                "Numarul de pagini: " + this.nrPag + "\n" +
                "Limba: " + this.limba + "\n" +
                "Pretul: " + this.pret + "\n";
    }
}
