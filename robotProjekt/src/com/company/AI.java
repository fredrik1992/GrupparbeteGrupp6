package projektarbetet;

public class AI {
    //variabler
    int numberOfZebrasLeft;
    Zebra[] zebra;
    Gepard[] gepard;
    Djurlista list;


    public AI() {
        list = new Djurlista();
        numberOfZebrasLeft = 0;

    }

    public void createArrays() {
        list.getInputOnAnimalQuantity();
        numberOfZebrasLeft = list.getQuantityZebras();
        zebra = new Zebra[list.getQuantityZebras()];
        gepard = new Gepard[list.getQuantityCheetahs()];
    }

    public void startGame() {
        gameLoop();

    }

    public void gameLoop() {
        for (int i = 0; i < zebra.length; i++) {
            if (zebra[i].getDead() == false) {

                //send a object of zebra  to spelplan vektor (zebra)

            }
        }
        for (int i = 0; i < gepard.length; i++) {
            if (gepard[i].isResting() == false) {

                //send a object of zebra  to spelplan vektor (zebra)

            }
        }

        for (int j = 0; j < gepard.length; j++){
            for (int i = 0; i < zebra.length; i++){

                if (zebra[i].getX() == gepard[j].getX() && zebra[i].getY() == gepard[j].getY()){
                    if (zebra[i].getDead() == false  && gepard[j].isResting() ==false){
                        zebra[i].setDead();
                        gepard[j].restAfterEating();
                        numberOfZebrasLeft --;

                    }
                }

            }
        }

    /*for gepard[i]
        for  zebra[i]
            while (xebra gepad x,y && gepar.vila false)
            zebra (i).set(true)
            if gepard != vilar &&zebra !=död





     */

        //äta
        //gå


        //ha

    }


    //constructor
}
