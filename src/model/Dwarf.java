
package model;


public class Dwarf extends SpecialMovablePiece{
    
    /**
     * Constructor-initializes a new Dwarf with team
     * @param team 
     */
    public Dwarf(String team){
       super(special_power.bomb_destroyer,"Dwarf",team,3);
    }
    
    
    @Override
    public int attack(Piece e){
        if(e instanceof Bomb){
            System.out.println("Dwarf attacks Bomb");
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