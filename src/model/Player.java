
package model;

import java.util.ArrayList;
import java.util.Collections;


public class Player {
    private String name;
    private ArrayList<Piece> ActivePieces;  
    private ArrayList<Piece> InActivePieces;  
    private int num_of_resses;
    private String team;
    private boolean hasPlayed;
    private String[] Ress_board;
    
    /**
     * Constructor- initializes a new Player with name and team
     * @param x
     * @param team 
     */
    public Player(String x,String team){
        this.name=x;
        ActivePieces = new ArrayList<Piece>();
        InActivePieces = new ArrayList<Piece>();
        this.num_of_resses=0;
        this.team=team;
        this.num_of_resses=0;
        Ress_board=new String[2];
        for(int i=0;i<2;i++){
            Ress_board[i]=null;
        }
        initialize_pieces(team);
    }
    
    
    /**
     * Accessor-returns the name field num_of_resses
     * return int
     */
    public int getRess(){
        return this.num_of_resses;    
    }
    
    /**
     * this function is used to make the resurrection for a player. takes the last MoveablePiece of this player that was
     * killed and returns it.also makes the changes to the arraylists.
     * @return MoveablePiece
     */
    public MoveablePiece Ress(){
        this.num_of_resses++;
        int x=this.InActiveCardsSize();
        MoveablePiece e;
        if(x!=0){
            e=(MoveablePiece)this.InActivePieces.get(x-1);
            this.addToActiveCards(e);
            this.removeFromInActiveCards(e);
            return e;
        }
        return null;
    }
    
    /**
     * returns true if a resurrection can be done,false otherwise
     * @return boolean
     */
    public boolean ValidRess(String x){
        int count=0;
        int ret=0;
        if(this.num_of_resses<2){
            for(int i=0;i<2;i++){
                if(Ress_board[i]!=x){
                    count++;
                }
            }
            if(count==2){
                if(Ress_board[0]==null){
                    Ress_board[0]=x;
                    return true;
                }else if(Ress_board[1]==null){
                    Ress_board[1]=x;
                    return true;
                }else
                    return false;
            }
        }
        return false;
    }
    
    /**
     * Accessor-returns the name of the palyer
     * @return 
     */
    public String getName(){
        return this.name;
    }
    
    /**
     * transformer-sets the name of the player
     * @param x 
     */
    public void setName(String x){
        this.name=x;
    }
    
    /**
     * Accessor-returns the team of the palyer
     * @return 
     */
    public String getTeam(){
        return this.team;
    }
    
    /**
     * transformer-sets the team of the player
     * @param x 
     */
    public void setTeam(String x){
        this.team=x;
    }
    
    /**
     * add a card to the Arraylist of active cards
     * @param e 
     */
    public void addToActiveCards(Piece e){
        this.ActivePieces.add(e);
    }
    
    /**
     * add a card to the Arraylist of Inactive cards
     * @param e 
     */
    public void addToInActiveCards(Piece e){
        this.InActivePieces.add(e);
    }
    
    /**
     * remove a card from the Arraylist of active cards
     * @param e 
     */
    public void removeFromActiveCards(Piece e){
        this.ActivePieces.remove(e);
    }
    
    /**
     * remove a card from the Arraylist of Inactive cards
     * @param e 
     */
    public void removeFromInActiveCards(Piece e){
        this.InActivePieces.remove(e);
    }

    /**
     * Initializes the pieces acording to the team
     * @param x 
     */
    public void initialize_pieces(String x) {
        this.ActivePieces.add(new Dragon(team));
        this.ActivePieces.add(new Mage(team));
        this.ActivePieces.add(new Knight(team));
        this.ActivePieces.add(new Knight(team));
        this.ActivePieces.add(new Beast_Rider(team));
        this.ActivePieces.add(new Beast_Rider(team));
        this.ActivePieces.add(new Beast_Rider(team));
        this.ActivePieces.add(new Sorceress(team));
        this.ActivePieces.add(new Sorceress(team));
        this.ActivePieces.add(new Elf(team));
        this.ActivePieces.add(new Elf(team));
        this.ActivePieces.add(new Dwarf(team));
        this.ActivePieces.add(new Dwarf(team));
        this.ActivePieces.add(new Dwarf(team));
        this.ActivePieces.add(new Dwarf(team));
        this.ActivePieces.add(new Dwarf(team));
        this.ActivePieces.add(new Scout(team));
        this.ActivePieces.add(new Scout(team));
        this.ActivePieces.add(new Scout(team));
        this.ActivePieces.add(new Scout(team));
        this.ActivePieces.add(new Slayer(team));
        this.ActivePieces.add(new Bomb(team));
        this.ActivePieces.add(new Bomb(team));
        this.ActivePieces.add(new Bomb(team));
        this.ActivePieces.add(new Bomb(team));
        this.ActivePieces.add(new Bomb(team));
        this.ActivePieces.add(new Bomb(team));
        this.ActivePieces.add(new Flag(team));
        if(x=="Volcandria"){
            this.ActivePieces.add(new Lava_Beast());
            this.ActivePieces.add(new Lava_Beast());
        }else{
            this.ActivePieces.add(new Yeti());
            this.ActivePieces.add(new Yeti());
        }
        //Collections.shuffle(ActivePieces);  //?????????????
          
    }
    
    
    /**
     * returns the Arraylist of active cards
     * @return 
     */
    public ArrayList getActiveCards() {
        return this.ActivePieces;
    }
    
    /**
     * returns the Arraylist of Inactive cards
     * @return 
     */
    public ArrayList getInActiveCards() {
        return this.InActivePieces;
    }
    
    
    /**
     * returns the size of the Arraylist of active cards
     * @return 
     */
    public int ActiveCardsSize(){
        return this.ActivePieces.size();
    }
    
    /**
     * returns the size of the Arraylist of Inactive cards
     * @return 
     */
    public int InActiveCardsSize(){
        return this.InActivePieces.size();
    }
    
    
    /**
     * returns how many immovablePieces are in the arraylist of active cards
     * @return 
     */
    public int HowManyImmovablePieces(){
        int count=0;
        for(int i=0;i<this.ActivePieces.size();i++){
            if(this.ActivePieces.get(i) instanceof ImmovablePiece){
                count++;
            }
        }
        return count;     
    }
   
    
    /**
     * returns if the player has his flag active
     * @return 
     */
    public boolean HasFlag(){
        for(int i=0;i<this.ActivePieces.size();i++){
            if(this.ActivePieces.get(i) instanceof Flag){
                return true;
            }
        }
        return false;
    }
    
    
    /**
     * returns the field hasPlayed
     * @return 
     */
    public boolean Has_Played(){
        return this.hasPlayed;
    }

    /**
     * print the ArrayList of ActiveCards
     */
    public void PrintActivePieces(){
        System.out.println("Number of Active Pieces: " + this.ActivePieces.size());
        for(int i=0;i<this.ActivePieces.size();i++){
            System.out.println(this.ActivePieces.get(i).getName());
        }
    }
    
    /**
     * print the ArrayList of InActiveCards
     */
    public void PrintInActivePieces(){
        System.out.println("Number of Inactive Pieces: " + this.InActivePieces.size());
        for(int i=0;i<this.InActivePieces.size();i++){
            System.out.println(this.InActivePieces.get(i).getName());
        }
    }
    
    /**
     * print the ress board of the player
     */
    public void Print_Ress_board(){
        for (int i = 0; i < 2; i++) {
            System.out.println(Ress_board[i]);
        }
    }
    
    
    
}
