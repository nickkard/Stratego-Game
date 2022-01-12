
package model;


public class Slayer extends SpecialMovablePiece{
    
    /**
     * Constructor-initializes a new Slayer with team
     * @param team 
     */
    public Slayer(String team){
        super(special_power.dragon_killer,"Slayer",team,1);
    }
    
    
    
    @Override
    public int attack(Piece e){
        if(e instanceof Dragon){
            return 100;
        }else{
            if(this.getRank()>e.getRank()){
                return 100;
            }else if(this.getRank()<e.getRank()){
                return 101;
            }else{
                return 102;
            }
        }
    }
}
