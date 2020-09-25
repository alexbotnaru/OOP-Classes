package com.company;

public class Main {

    public static void main(String[] args) {
	Dictionar dic1=new Dictionar("explicativ",2012,400,"romana",150.69);
        System.out.println(dic1.print());
        dic1.setPret(100.99);
        System.out.println("-------Dupa schimbarea pretului-------");
        System.out.println(dic1.print());

    Dictionar dic2 = new Dictionar("de sinonime",2015,350,"romana",89.99);
        System.out.println(dic2.print());

        System.out.println("Numarul de pagini al dictionarelor:\n" + dic1.getNrPag() + " si " + dic2.getNrPag());
        System.out.println("------------------A doua Clasa-------------------");
        Televizor TV1 = new Televizor("Samsung",35.9,5050,"DA");
        Televizor TV2 = new Televizor("LG",40,5050,"NU");
        System.out.println(TV1.print());
        TV1.setPretul(4900);
        System.out.println("-------Dupa schimbarea pretului-------");
        System.out.println(TV1.print());
        System.out.println(TV2.print());

    }
}
