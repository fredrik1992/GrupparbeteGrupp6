package com.company;

public class Main {

    public static void main(String[] args) {
        Gepard g = new Gepard();
        Zebra z = new Zebra();
        Djurlista d1 = new Djurlista();
        d1.getInputOnAnimalQuantity();
        Zebra[] zebra = new Zebra[d1.getQuantityZebras()];
        Gepard[] gepard = new Gepard[d1.getQuantityCheetahs()];

        d1.setVektors(zebra, gepard);
        for (int i = 0 ; i< zebra.length;i++){
            System.out.println(zebra[i].getSteps());
        }



    }
}
