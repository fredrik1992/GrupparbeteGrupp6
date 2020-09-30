package com.company;

public class GameBoard {

    Zebra[] zebra;
    Cheetah[] cheetah;
    String[][] str = new String[10][10];

////fill
    public GameBoard( Zebra[] zebra, Cheetah[] cheetah){
        this.zebra = zebra ;
        this.cheetah = cheetah;

    }///  end of konstruktör


    public void fill(){
        for(int i = 0 ;  i < 10 ; i++) {
            for (int j = 0; j < 10; j++) {
                str[i][j] = " ";
            }
        }


        for(int i  = 0 ; i < zebra.length  ;i++  ){
            if(zebra[i].getDead() == true){
                str[zebra[i].getX()][zebra[i].getY()] = " ";
            }
            else{
                str[zebra[i].getX()][zebra[i].getY()] = "Z";
            }
        }

        for(int i  = 0 ; i < cheetah.length  ;i++  ){
            /// check all the zebras
            str[cheetah[i].getX()][cheetah[i].getY()] = "C";
        }

    }



public void print(){
    fill();
        for(int i = 0 ;  i < 10 ; i++) {
    for (int j = 0; j < 10; j++) {
        System.out.print ("["+str[i][j]+ "]");
        if(j == 9){
            System.out.println ();
           /// System.out.println ("-----------------------------------------------");
                  }

             }
        }

}


        ////refill
        /// tar 2  listor
        /// fylla in med zibras
        /// in med leopard enligt uppgift beskrivning



}
