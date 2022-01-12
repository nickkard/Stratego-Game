
package stratego;

import Controller.Controller;
import view.grafic;


public class Stratego {

    /*
    main class- creates a new Grafic and initializes the board
    */
    public static void main(String[] args) {
        grafic G1=new grafic();
        G1.game.initialize_board();
    }
    
}
