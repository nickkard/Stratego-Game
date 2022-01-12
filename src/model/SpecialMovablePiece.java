
package model;

/**
 * 
 * enum for the special forces
 */
enum special_power{
        flying,speed,arrows,bomb_destroyer,more_than_1_cell,dragon_killer
};

public abstract class SpecialMovablePiece extends MoveablePiece{
    private special_power power;
    
    /**
     * COnstructor-initializes a new SpecialMoveablePiece with special_power,name,team ,rank
     * @param x
     * @param name
     * @param team
     * @param rank 
     */
    public SpecialMovablePiece(special_power x,String name,String team , int rank){
        super(name,team ,rank);
        this.power=x;
    }
    
    /**
     * Accessor-greturns the special_power
     * @return 
     */
    public special_power getPower(){
        return this.power;
    }
    
    /**
     * Transformer-sets the special_power 
     * @param x 
     */
    public void setPower(special_power x){
        this.power=x;
    }
    


    
}
