
package model;


public abstract class Piece {
    private int rank;
    private int thesis;
    private String name;
    private String team;
    
    
    /**
     * Constructor- initializes a new piece with name,team and rank
     * @param name
     * @param team
     * @param rank 
     */
    public Piece(String name,String team,int rank){
            this.name=name;
            this.team=team;
            this.rank=rank;
    }        
            
    /**
     * Accessor-returns the team of the piece
     * @return String
     */        
    public String getTeam(){
        return this.team;
    }
    
    
    /**
     * Transformer-sets the team of the piece
     * @param x 
     */
    public void setTeam(String x){
        this.team=x;
    }
    
    /**
     * Accessor-returns the name of the piece
     * @return String
     */
    public String getName(){
        return this.name;
    }
    
    /**
     * Transformer-sets the name of the piece
     * @param x 
     */
    public void setName(String x){
        this.name=x;
    }
    
    /**
     * Accessor-returns the rank of the piece
     * @return int
     */
    public int getRank(){
        return this.rank;
    }
    
    /**
     * Transformer-sets the rank of the piece
     * @param x 
     */
    public void setRank(int x){
        this.rank=x;
    }
    
    public int getThesis(){
        return this.thesis;
    }
    
    public void setThesis(int x){
        this.thesis=x;
    }
    
}
