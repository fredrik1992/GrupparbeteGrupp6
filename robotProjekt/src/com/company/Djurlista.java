//22/09/2020 Fredrik

package com.company;


import java.util.Scanner;

public class Djurlista {

    private int quantityCheetahs;
    private int quantityZebras;


    public Djurlista() {
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

    public void getInputOnAnimalQuantity() {
        Scanner scan = new Scanner(System.in);
        boolean i = false;
        while (i == false) {
            System.out.println("please provide the quantity of Zeebras in the game");
            setQuantityZebras(scan.nextInt());
            System.out.println("please provide the quantity of Cheetas in the game");
           setQuantityCheetahs(scan.nextInt());
            if (quantityZebras >= quantityCheetahs) {
                System.out.println("the games is set time to play!");
                i = true;


            }
        }

    }

    public void setVektors(Zebra[] zebras, Gepard[] ceetah) {

        for (int i = 0; i < zebras.length; i++) {
            zebras[i] = new Zebra();
        }
        for (int i = 0; i < ceetah.length; i++) {
            ceetah[i] = new Gepard();
        }


    }


    //kommer ifrån ai input antal;int, input antal geparder:int
    //zebror måste vara fler eller lika med geoparder


    //skapa en vektor med sebror antal
    //skapa en vektor med geparder antal

}

