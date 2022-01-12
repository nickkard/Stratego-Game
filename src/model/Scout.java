
package model;


public class Scout extends SpecialMovablePiece{
    
    /**
     * Constructor-initializes a new Scout with team
     * @param team 
     */
    public Scout(String team){
       super(special_power.more_than_1_cell,"Scout",team,2);
    }
    
   
}
