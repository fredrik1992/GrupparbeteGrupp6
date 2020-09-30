package com.company;


import java.util.Scanner;

public class AnimalList {

    private int quantityCheetahs;
    private int quantityZebras;


    public AnimalList() {
        this.quantityCheetahs = 0;
        this.quantityZebras = 0;


    }

    public void setQuantityCheetahs(int quantityCheetahs) {
        this.quantityCheetahs = quantityCheetahs;
    }

    public void setQuantityZebras(int quantityZebras) {
        this.quantityZebras = quantityZebras;
    }


    public int getQuantityCheetahs() {
        return quantityCheetahs;
    }

    public int getQuantityZebras() {
        return quantityZebras;
    }

    public void getInputOnAnimalQuantity() {// takes two inputs and gives them to quantity of zebras and cheetahs
        Scanner scan = new Scanner(System.in);
        boolean i = false;
        while (i == false) {
            System.out.println("please provide the quantity of Zeebras in the game");
            setQuantityZebras(scan.nextInt());
            System.out.println("please provide the quantity of Cheetas in the game");
            setQuantityCheetahs(scan.nextInt());
            if (quantityZebras >= quantityCheetahs) {//checks that zebras are never less then cheetahs
                System.out.println("the games is set time to play!");
                i = true;


            }
        }

    }

    public void setArrays(Zebra[] zebras, Cheetah[] cheetah) {//takes two vectors and give them values

        for (int i = 0; i < zebras.length; i++) {
            zebras[i] = new Zebra();
        }
        for (int i = 0; i < cheetah.length; i++) {
            cheetah[i] = new Cheetah();
        }


    }


}

