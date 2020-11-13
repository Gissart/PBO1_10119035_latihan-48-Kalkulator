package com.tugasPBO;
/*Nama      : Argya Aulia Fauzandika
  NIM       : 10119035
  Kelas     : PBO1  / IF1
  Deskripsi : Program kalkulator sederhana menggunakan getter setter
* */

public class Main {
    public static void main(String[] args){
        Kalkulator kal = new Kalkulator();
        kal.setValue1(7.0);
        System.out.println("value1 = "+kal.getValue1());
        kal.setValue2(5.0);
        System.out.println("value2 = "+kal.getValue2());
        kal.setNameProject();
        kal.setNoteProject("This project shown you how to manage method in java");
        System.out.println("Result add is = "+kal.add(kal.getValue1(), kal.getValue2()));
        System.out.println("Result minus is = "+kal.minus(kal.getValue1(), kal.getValue2()));
        System.out.println("Result multiple is = "+kal.multiplication(kal.getValue1(), kal.getValue2()));
        System.out.println("Resul division is = "+kal.division(kal.getValue1(), kal.getValue2()));
    }

}
