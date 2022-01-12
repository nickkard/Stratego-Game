
package Controller;


import model.Blocks;
import model.Board;
import model.MoveablePiece;
import model.Piece;
import model.Player;
import model.Scout;
import view.grafic;


public class Controller {
    
    private boolean gameEnded,cardHasPlayed;
    public Player P1,P2;
    private int turn;
    private Player lastPlayer;
    public Board board;
    public grafic Gui;
    
    /**
     * Constructor-initializes a Controller for a new game
     */
    public Controller(){
        P1=new Player("Nikos","Everwinter");
        P2=new Player("Manos","Volcandria");
        gameEnded=false;
        cardHasPlayed=false;
        board=new Board();
        turn=0;
    }

    
    /**
     * initializes the array of the board with the players cards
     */
    public void initialize_board(){
        for(int i=0;i<30;i++){
            this.board.arr[i]=(Piece) P1.getActiveCards().get(i);
        }
        for(int i=50;i<80;i++){
            this.board.arr[i]=(Piece) P2.getActiveCards().get(i-50);      
        }
    }
    
    /**
     * calls the "attack" function of the MoveablePieces and depending to the return value, makes the changes to the players ArraLists, the array of the board,and also checks for resurrection. 
     * @param a, index of the first card in the array
     * @param b, index of the second card in the array
     * @param k , the text of the first button pushed
     * @return int, the return value of the attack function, or (if a reurrection can be done) the index of the array where to put the card.
     */
    public int makeChanges(String a,String b,String k){
        System.out.println("Move by : " + ((this.getTurn()==0) ? "Volcandria" : "Everwinter"));
        int x=Integer.valueOf(a);
        int y=Integer.valueOf(b);
        int e = -1;
        if(this.board.arr[x] instanceof MoveablePiece){
            MoveablePiece w=(MoveablePiece)this.board.arr[x];
            e=w.attack(this.board.arr[y]);
            System.out.println("Rank of attacker : " + this.board.arr[x].getRank() + ", Rank of defender : " + this.board.arr[y].getRank());
            if(e==100){
                //System.out.println("Attacker has higher rank");
                System.out.println("Winner : " + this.board.arr[x].getName());
                if (this.board.arr[y].getName() != "Empty") {
                    if (this.turn == 0) {
                        this.P1.removeFromActiveCards(this.board.arr[y]);
                        this.P1.addToInActiveCards(this.board.arr[y]);
                        this.board.lastRessRank_Ever=this.board.arr[y].getRank();
                    } else {
                        this.P2.removeFromActiveCards(this.board.arr[y]);
                        this.P2.addToInActiveCards(this.board.arr[y]);
                        this.board.lastRessRank_Vol=this.board.arr[y].getRank();
                    }
                }
                //---------------------------resurrection check--------------------------
                int z=this.board.isEdgeBox(y);
                if (!(this.board.arr[x] instanceof Scout)) {
                    if ((this.turn == 0) && ((z == 0) || (z == 1) || (z == 9))) {
                        if (this.P2.InActiveCardsSize() != 0) {
                            if (this.P2.ValidRess(k) == true) {
                                MoveablePiece t = this.P2.Ress();
                                System.out.println("Ressurecting a : " + t.getName() + " for team : " + t.getTeam());
                                int j = this.board.WhereToPlace(t);
                                e = j;
                                System.out.println(t.getTeam() + " ressurecting. Resurrections left : " + (2 - this.P2.getRess()));
                            } else {
                                System.out.println("P2 cannot perform ressurection");
                            }
                            System.out.println("*");
                            this.P2.Print_Ress_board();
                            System.out.println("*");
                        }else{
                            System.out.println("No Inactive cards!");
                        }
                    }
                    if ((this.turn == 1) && ((z == 70) || (z == 71) || (z == 79))) {
                        if (this.P1.InActiveCardsSize() != 0) {
                            if (this.P1.ValidRess(k) == true) {
                                MoveablePiece t = this.P1.Ress();
                                System.out.println("Ressurecting a : " + t.getName() + " for team : " + t.getTeam());
                                int j = this.board.WhereToPlace(t);
                                e = j;
                                System.out.println(t.getTeam() + " ressurecting. Resurrections left : " + (2 - this.P1.getRess()));
                            } else {
                                System.out.println("P1 cannot perform ressurection");
                            }
                            this.P1.Print_Ress_board();
                        } else {
                            System.out.println("No Inactive cards!");
                        }
                    }
                    /*System.out.println("+++++++++++++++++++++++-Active Pieces P1-+++++++++++++++++++++++");
                    this.P1.PrintActivePieces();
                    System.out.println("+++++++++++++++++++++++-InActive Pieces P1-+++++++++++++++++++++++");
                    this.P1.PrintInActivePieces();
                    System.out.println("+++++++++++++++++++++++-Active Pieces P2-+++++++++++++++++++++++");
                    this.P2.PrintActivePieces();
                    System.out.println("+++++++++++++++++++++++-InActive Pieces P2-+++++++++++++++++++++++");
                    this.P2.PrintInActivePieces();*/
                } else {
                    System.out.println("O Scout den mporei na kanei ress");
                }
                //---------------------------end of resurrection check--------------------------
                this.board.arr[y] = this.board.arr[x];
                this.board.arr[x] = new Blocks("Empty");
                
            }else if(e==101){
                //System.out.println("Defender has higher rank");
                System.out.println("Winner : " + this.board.arr[y].getName());
                if (this.board.arr[y].getName() != "Empty") {
                    if (this.turn == 0) {
                        this.P2.removeFromActiveCards(this.board.arr[x]);
                        this.P2.addToInActiveCards(this.board.arr[x]);
                        this.board.lastRessRank_Vol=this.board.arr[x].getRank();
                    } else {
                        this.P1.removeFromActiveCards(this.board.arr[x]);
                        this.P1.addToInActiveCards(this.board.arr[x]);
                        this.board.lastRessRank_Ever=this.board.arr[x].getRank();
                    }
                }
                this.board.arr[x]=new Blocks("Empty");
            }else if(e==102){
                //System.out.println("Attacker and Winner have equal ranks");
                System.out.println("No winner");
                if(this.turn==0){
                    this.P2.removeFromActiveCards(this.board.arr[x]);
                    this.P2.addToInActiveCards(this.board.arr[x]);
                    this.P1.removeFromActiveCards(this.board.arr[y]);
                    this.P1.addToInActiveCards(this.board.arr[y]);
                    this.board.lastRessRank_Vol=this.board.arr[x].getRank();
                    this.board.lastRessRank_Ever=this.board.arr[y].getRank();
                }
                else{
                    this.P1.removeFromActiveCards(this.board.arr[x]);
                    this.P1.addToInActiveCards(this.board.arr[x]);
                    this.P2.removeFromActiveCards(this.board.arr[y]);
                    this.P2.addToInActiveCards(this.board.arr[y]);
                    this.board.lastRessRank_Ever=this.board.arr[x].getRank();
                    this.board.lastRessRank_Vol=this.board.arr[y].getRank();
                }
                this.board.arr[x]=new Blocks("Empty");
                this.board.arr[y]=new Blocks("Empty");
            }
        }
        /*System.out.println("@@@@@@@@@@@@@@@@@@@@-Active Pieces P1-@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        this.P1.PrintActivePieces();
        System.out.println("@@@@@@@@@@@@@@@@@@@@@-InActive Pieces P1-@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        this.P1.PrintInActivePieces();
        System.out.println("@@@@@@@@@@@@@@@@@@@@-Active Pieces P2-@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        this.P2.PrintActivePieces();
        System.out.println("@@@@@@@@@@@@@@@@@@@@@-InActive Pieces P2-@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        this.P2.PrintInActivePieces();
        System.out.println(" E ==== " + e);*/
        return e;
    }
    
    
    
    /**
     * Transformer- sets the variable gameEnded
     * @param x 
     */
    public void setGameEnded(boolean x){
        this.gameEnded=x;
    }
    
    /**
     * Accessor-returns the variable gameEnded
     * @return 
     */
    public int GameEnded() {
            if (this.P1.HasFlag() == false) {
                this.gameEnded = true;
                return 2;
            }
            if (this.P1.HowManyImmovablePieces() == this.P1.ActiveCardsSize()) {
                this.gameEnded = true;
                return 2;
            }
            if (this.P2.HasFlag() == false) {
                this.gameEnded = true;
                return 1;
            }
            if (this.P2.HowManyImmovablePieces() == this.P2.ActiveCardsSize()) {
                this.gameEnded = true;
                return 1;
            }
        return 0;
    }

    /**
     * Accessor-returns the variable cardHasPlayed
     * @return 
     */
    public boolean getCardHasPlayed(){
        return this.cardHasPlayed;
    }
    
    /**
     * Accessor-returns which player plays next as int
     * @return 
     */
    public int getTurn(){
        return this.turn;
    }
    

   /**
    * changes the turn
    */
    public void changeTurn(){
        if(turn==0){
            turn=1;
        }else{
            turn=0;
        }
    }
    
    /**
     * Accessor-returns the player that played last
     * @return 
     */
    public Player getlastPlayer(){
        return this.lastPlayer;
    }
    
    /*
    Transformer- sets the player that played last
    */
    public void setlastPlayer(Player e ){
        this.lastPlayer=e;
    }
    
    
    
    
}
