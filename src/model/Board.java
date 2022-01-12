
package model;


public class Board {
    
    public Piece[] arr;
    public Piece Last_Ress_Piece_Vol;
    public Piece Last_Ress_Piece_Ever;
    public int Ress_Piece_place_Vol;
    public int Ress_Piece_place_Ever;
    public String lastDeletedText_Vol;
    public String lastDeletedText_Ever;
    public int lastRessRank_Ever;
    public int lastRessRank_Vol;
    
    /**
     * initializes a new board as array
     */
    public Board(){
        arr=new Piece[80];
        for(int i=0;i<80;i++){
            if((i==32)||(i==33)||(i==36)||(i==37)||(i==42)||(i==43)||(i==46)||(i==47)){
                arr[i]=new Blocks("Ristricted");
            }else{
                arr[i]=new Blocks("Empty");
            }
        }
    }
    
    /**
    *returns true if a box is a forbidden zone or flase otherwise
    */
    public boolean validBox(int x){
        if(arr[x].getName()=="Restricted"){
            return false;
        }else{
            return true;
        }    
    } 

    /**
     * returns if a box is empty
     * @param x
     * @return 
     */
    public boolean emptyBox(int x){
        if(arr[x].getName()=="Empty"){
            return true;
        }else{
            return false;
        }  
    }

    /**
     *this function is used for a resurrection and sets the fields Last_Ress_Piece(last card that was resurrected),Ress_Piece_place(where it is placed),lastRessRank(the rank of that card) depending on the team.
     * @param e
     * @return the index of the array where the card will be put 
     */
    public int WhereToPlace(Piece e){
        if(e.getTeam()=="Everwinter"){
            System.out.println("Enerwinter team");
            for(int i=0;i<30;i++){
                if(this.arr[i].getName()=="Empty"){
                    this.arr[i]=e;
                    this.Last_Ress_Piece_Ever=e;
                    this.Ress_Piece_place_Ever=i;
                    this.lastRessRank_Ever=e.getRank();
                    return i;
                }
            }
        }else  if(e.getTeam()=="Volcandria"){
            System.out.println("Volcandria team");
            for(int i=50;i<80;i++){
                if(this.arr[i].getName()=="Empty"){
                    this.arr[i]=e;
                    this.Last_Ress_Piece_Vol=e;
                    this.Ress_Piece_place_Vol=i;
                    this.lastRessRank_Vol=e.getRank();
                    return i;
                }
            }
        }
        return 0;
    }
    
    /**
     * this function is used to check if a box is at the edge of the board
     * @param x
     * @return int
     */
    public int isEdgeBox(int x){
        if(x==0){
            return 0;
        }else if(x==9){
            return 9;
        }else if(x==70){
            return 70;
        }else if(x==79){
            return 79;
        }else if((x==1)||(x==2)||(x==3)||(x==4)||(x==5)||(x==6)||(x==7)||(x==8)){
            return 1;
        }else if((x==10)||(x==20)||(x==30)||(x==40)||(x==50)||(x==60)){
            return 10;
        }else if((x==71)||(x==72)||(x==73)||(x==74)||(x==75)||(x==76)||(x==77)||(x==78)){
            return 71;
        }else if((x==19)||(x==29)||(x==39)||(x==49)||(x==59)||(x==69)){
            return 19;
        }else{
            return -1;
        }
    }

    
     /**
     * returns true if a move can be done, false otherwise
     * @param i
     * @return boolean 
     */
    public boolean ValidMove(int i, int y, int k) {
        if (this.arr[i].getTeam() == this.arr[y].getTeam()) {
            return false;
        } else if(this.arr[i] instanceof ImmovablePiece){
            return false;
        }else{     
            if (k == 0) {
                if ((y == 1) || (y == 10)) {
                    return true;
                } else {
                    return false;
                }
            } else if (k == 9) {
                if ((y == 8) || (y == 19)) {
                    return true;
                } else {
                    return false;
                }
            } else if (k == 70) {
                if ((y == 60) || (y == 71)) {
                    return true;
                } else {
                    return false;
                }
            } else if (k == 79) {
                if ((y == 78) || (y == 69)) {
                    return true;
                } else {
                    return false;
                }
            } else if ((k == 1)) {
                if ((y == i - 1) || (y == i + 1) || (y == i + 10)) {
                    return true;
                } else {
                    return false;
                }
            } else if ((k == 10)) {
                if ((y == i - 10) || (y == i + 10) || (y == i + 1)) {
                    return true;
                } else {
                    return false;
                }
            } else if ((k == 71)) {
                if ((y == i - 1) || (y == i + 1) || (y == i - 10)) {
                    return true;
                } else {
                    return false;
                }
            } else if ((k == 19)) {
                if ((y == i - 10) || (y == i + 10) || (y == i - 1)) {
                    return true;
                } else {
                    return false;
                }
            } else {
                if ((y == i - 10) || (y == i + 10) || (y == i - 1) || (y == i + 1)) {
                    return true;
                } else {
                    return false;
                }
            }
        }
    }
}