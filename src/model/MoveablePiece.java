
package model;


public abstract class MoveablePiece extends Piece{
    
    /**
     * Constructor-initializes a new MoveablePiece with name,team and rank
     * @param name
     * @param team
     * @param rank 
     */
    public MoveablePiece(String name,String team , int rank){
        super(name,team ,rank);
    }
    
    /**
     * Function that represents the attack ability of the MoveablePieces
     * @param e 
     * @return  
     */
    public int attack(Piece e){
        if(this.getRank()>e.getRank()){
            return 100;
        }else if(this.getRank()<e.getRank()){
            return 101;
        }else{
            return 102;
        }
    }
    
    /**
     * Function that represents the move ability of the MoveablePieces
     * @param x
     */
    public void move(int x){
            this.setThesis(x);
    }
   
    
}
