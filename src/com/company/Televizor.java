package com.company;

public class Televizor {
    private String marca;
    private float diagonala;
    private float pretul;
    private String stoc;


    public Televizor(String marca, float diagonala, float pretul, String stoc) {
        this.marca = marca;
        this.diagonala = diagonala;
        this.pretul = pretul;
        this.stoc = stoc;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getDiagonala() {
        return diagonala;
    }

    public void setDiagonala(float diagonala) {
        this.diagonala = diagonala;
    }

    public float getPretul() {
        return pretul;
    }

    public void setPretul(float pretul) {
        this.pretul = pretul;
    }

    public String getStoc() {
        return stoc;
    }

    public void setStoc(String stoc) {
        this.stoc = stoc;
    }
    public String print(){
        return "Marca: " + this.marca + "\n" +
                "Diagonala: " + this.marca + "\n" +
                "Pretul: " + this.pretul + "\n" +
                "In stoc: " + this.stoc + "\n" ;
    }
}
