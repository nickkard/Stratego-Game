
package model;


public abstract class ImmovablePiece extends Piece{
    
    /**
     * Constructor-initializes an ImmovablePiece with name,team and rank
     * @param name
     * @param team
     * @param rank 
     */
    public ImmovablePiece(String name,String team , int rank){
        super(name,team ,rank);
 }
}
