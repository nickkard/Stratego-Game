
package view;

import Controller.Controller;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.*;

public class grafic extends JFrame{
    public Controller game;
    private static final int NUMROWS = 8;
    private static final int NUMCOLS = 10;
    private JFrame f;
    private JPanel p1;
    public JButton[] b = new JButton[80];
    private boolean iconSelected;
    private JButton selectedButton;    
    public CardListener cl;
    String buttonClicked;
    
    /*
    Constructor- initializes the grafics for the game 
    */
    public grafic(){
        super("Stratego");
        game=new Controller();
        cl= new CardListener(game);
        p1 = new JPanel();//new FlowLayout());
        p1.setLayout(new GridLayout(NUMROWS, NUMCOLS));
        setSize(400, 300);
        setResizable(true);
        add(p1);
        init_buttons();
        //setLayout(new FlowLayout());
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        iconSelected=false;
    }
    
    
    /**
     * innitializes the buttons and images
     */
    public void init_buttons(){
        int w=0;
        Icon c = new ImageIcon(getClass().getResource("yeti.png"));
        for (int i = 0; i < 80; i++) {
                if (i < 30) {
                    //Icon a = new ImageIcon(getClass().getResource("blueHidden.png"));
                    b[i] = new JButton(String.valueOf(i)/*, a*/);
                    b[i].addMouseListener(cl);
                    b[i].setName(JOKERNAME);
                    //b[i].setRolloverIcon(c);
                } else if ((i >= 50) && (i < 80)) {
                    //Icon a = new ImageIcon(getClass().getResource("redHidden.png"));
                    b[i] = new JButton(String.valueOf(i)/*, a*/);
                    b[i].addMouseListener(cl);
                    b[i].setName(JOKERNAME);
                }else{
                    Icon a = new ImageIcon(getClass().getResource("grey2.png"));
                    b[i] = new JButton(String.valueOf(i), a);
                    b[i].addMouseListener(cl);
                    if(((i==32))||((i==33))||((i==42))||((i==43))||((i==36))||((i==37))||((i==46))||((i==47))){
                        b[i].removeMouseListener(cl);
                        b[i].setBorderPainted(false);
                        b[i].setFocusPainted(false);
                        b[i].setEnabled(false);
                        b[i].setBackground(Color.BLACK);
                    }
                }
                b[i].setText(Integer.toString(w));
                p1.add(b[i]);
                w++;
            }
        try {
            /////setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/resources/images/bluePieces/trapB.png")).getScaledInstance(180, 120, Image.SCALE_SMOOTH)));
            b[0].setIcon(new ImageIcon(ImageIO.read(getClass().getResource("dragonB.png")).getScaledInstance(150, 100, Image.SCALE_SMOOTH)));
            b[1].setIcon(new ImageIcon(ImageIO.read(getClass().getResource("mageB.png")).getScaledInstance(150, 100, Image.SCALE_SMOOTH)));
            b[2].setIcon(new ImageIcon(ImageIO.read(getClass().getResource("knightB.png")).getScaledInstance(150, 100, Image.SCALE_SMOOTH)));
            b[3].setIcon(new ImageIcon(ImageIO.read(getClass().getResource("knightB.png")).getScaledInstance(150, 100, Image.SCALE_SMOOTH)));
            b[4].setIcon(new ImageIcon(ImageIO.read(getClass().getResource("beastRiderB.png")).getScaledInstance(150, 100, Image.SCALE_SMOOTH)));
            b[5].setIcon(new ImageIcon(ImageIO.read(getClass().getResource("beastRiderB.png")).getScaledInstance(150, 100, Image.SCALE_SMOOTH)));
            b[6].setIcon(new ImageIcon(ImageIO.read(getClass().getResource("beastRiderB.png")).getScaledInstance(150, 100, Image.SCALE_SMOOTH)));
            b[7].setIcon(new ImageIcon(ImageIO.read(getClass().getResource("sorceressB.png")).getScaledInstance(150, 100, Image.SCALE_SMOOTH)));
            b[8].setIcon(new ImageIcon(ImageIO.read(getClass().getResource("sorceressB.png")).getScaledInstance(150, 100, Image.SCALE_SMOOTH)));
            b[9].setIcon(new ImageIcon(ImageIO.read(getClass().getResource("elfB.png")).getScaledInstance(150, 100, Image.SCALE_SMOOTH)));
            b[10].setIcon(new ImageIcon(ImageIO.read(getClass().getResource("elfB.png")).getScaledInstance(150, 100, Image.SCALE_SMOOTH)));
            b[11].setIcon(new ImageIcon(ImageIO.read(getClass().getResource("dwarfB.png")).getScaledInstance(150, 100, Image.SCALE_SMOOTH)));
            b[12].setIcon(new ImageIcon(ImageIO.read(getClass().getResource("dwarfB.png")).getScaledInstance(150, 100, Image.SCALE_SMOOTH)));
            b[13].setIcon(new ImageIcon(ImageIO.read(getClass().getResource("dwarfB.png")).getScaledInstance(150, 100, Image.SCALE_SMOOTH)));
            b[14].setIcon(new ImageIcon(ImageIO.read(getClass().getResource("dwarfB.png")).getScaledInstance(150, 100, Image.SCALE_SMOOTH)));
            b[15].setIcon(new ImageIcon(ImageIO.read(getClass().getResource("dwarfB.png")).getScaledInstance(150, 100, Image.SCALE_SMOOTH)));
            b[16].setIcon(new ImageIcon(ImageIO.read(getClass().getResource("scoutB.png")).getScaledInstance(150, 100, Image.SCALE_SMOOTH)));
            b[17].setIcon(new ImageIcon(ImageIO.read(getClass().getResource("scoutB.png")).getScaledInstance(150, 100, Image.SCALE_SMOOTH)));
            b[18].setIcon(new ImageIcon(ImageIO.read(getClass().getResource("scoutB.png")).getScaledInstance(150, 100, Image.SCALE_SMOOTH)));
            b[19].setIcon(new ImageIcon(ImageIO.read(getClass().getResource("scoutB.png")).getScaledInstance(150, 100, Image.SCALE_SMOOTH)));
            b[20].setIcon(new ImageIcon(ImageIO.read(getClass().getResource("slayerB.png")).getScaledInstance(150, 100, Image.SCALE_SMOOTH)));
            b[21].setIcon(new ImageIcon(ImageIO.read(getClass().getResource("trapB.png")).getScaledInstance(150, 100, Image.SCALE_SMOOTH)));
            b[22].setIcon(new ImageIcon(ImageIO.read(getClass().getResource("trapB.png")).getScaledInstance(150, 100, Image.SCALE_SMOOTH)));
            b[23].setIcon(new ImageIcon(ImageIO.read(getClass().getResource("trapB.png")).getScaledInstance(150, 100, Image.SCALE_SMOOTH)));
            b[24].setIcon(new ImageIcon(ImageIO.read(getClass().getResource("trapB.png")).getScaledInstance(150, 100, Image.SCALE_SMOOTH)));
            b[25].setIcon(new ImageIcon(ImageIO.read(getClass().getResource("trapB.png")).getScaledInstance(150, 100, Image.SCALE_SMOOTH)));
            b[26].setIcon(new ImageIcon(ImageIO.read(getClass().getResource("trapB.png")).getScaledInstance(150, 100, Image.SCALE_SMOOTH)));
            b[27].setIcon(new ImageIcon(ImageIO.read(getClass().getResource("flagB.png")).getScaledInstance(150, 100, Image.SCALE_SMOOTH)));
            b[28].setIcon(new ImageIcon(ImageIO.read(getClass().getResource("yeti.png")).getScaledInstance(150, 100, Image.SCALE_SMOOTH)));
            b[29].setIcon(new ImageIcon(ImageIO.read(getClass().getResource("yeti.png")).getScaledInstance(150, 100, Image.SCALE_SMOOTH)));

            b[50].setIcon(new ImageIcon(ImageIO.read(getClass().getResource("dragonR.png")).getScaledInstance(150, 100, Image.SCALE_SMOOTH)));
            b[51].setIcon(new ImageIcon(ImageIO.read(getClass().getResource("mageR.png")).getScaledInstance(150, 100, Image.SCALE_SMOOTH)));
            b[52].setIcon(new ImageIcon(ImageIO.read(getClass().getResource("knightR.png")).getScaledInstance(150, 100, Image.SCALE_SMOOTH)));
            b[53].setIcon(new ImageIcon(ImageIO.read(getClass().getResource("knightR.png")).getScaledInstance(150, 100, Image.SCALE_SMOOTH)));
            b[54].setIcon(new ImageIcon(ImageIO.read(getClass().getResource("beastRiderR.png")).getScaledInstance(150, 100, Image.SCALE_SMOOTH)));
            b[55].setIcon(new ImageIcon(ImageIO.read(getClass().getResource("beastRiderR.png")).getScaledInstance(150, 100, Image.SCALE_SMOOTH)));
            b[56].setIcon(new ImageIcon(ImageIO.read(getClass().getResource("beastRiderR.png")).getScaledInstance(150, 100, Image.SCALE_SMOOTH)));
            b[57].setIcon(new ImageIcon(ImageIO.read(getClass().getResource("sorceressR.png")).getScaledInstance(150, 100, Image.SCALE_SMOOTH)));
            b[58].setIcon(new ImageIcon(ImageIO.read(getClass().getResource("sorceressR.png")).getScaledInstance(150, 100, Image.SCALE_SMOOTH)));
            b[59].setIcon(new ImageIcon(ImageIO.read(getClass().getResource("elfR.png")).getScaledInstance(150, 100, Image.SCALE_SMOOTH)));
            b[60].setIcon(new ImageIcon(ImageIO.read(getClass().getResource("elfR.png")).getScaledInstance(150, 100, Image.SCALE_SMOOTH)));
            b[61].setIcon(new ImageIcon(ImageIO.read(getClass().getResource("dwarfR.png")).getScaledInstance(150, 100, Image.SCALE_SMOOTH)));
            b[62].setIcon(new ImageIcon(ImageIO.read(getClass().getResource("dwarfR.png")).getScaledInstance(150, 100, Image.SCALE_SMOOTH)));
            b[63].setIcon(new ImageIcon(ImageIO.read(getClass().getResource("dwarfR.png")).getScaledInstance(150, 100, Image.SCALE_SMOOTH)));
            b[64].setIcon(new ImageIcon(ImageIO.read(getClass().getResource("dwarfR.png")).getScaledInstance(150, 100, Image.SCALE_SMOOTH)));
            b[65].setIcon(new ImageIcon(ImageIO.read(getClass().getResource("dwarfR.png")).getScaledInstance(150, 100, Image.SCALE_SMOOTH)));
            b[66].setIcon(new ImageIcon(ImageIO.read(getClass().getResource("scoutR.png")).getScaledInstance(150, 100, Image.SCALE_SMOOTH)));
            b[67].setIcon(new ImageIcon(ImageIO.read(getClass().getResource("scoutR.png")).getScaledInstance(150, 100, Image.SCALE_SMOOTH)));
            b[68].setIcon(new ImageIcon(ImageIO.read(getClass().getResource("scoutR.png")).getScaledInstance(150, 100, Image.SCALE_SMOOTH)));
            b[69].setIcon(new ImageIcon(ImageIO.read(getClass().getResource("scoutR.png")).getScaledInstance(150, 100, Image.SCALE_SMOOTH)));
            b[70].setIcon(new ImageIcon(ImageIO.read(getClass().getResource("slayerR.png")).getScaledInstance(150, 100, Image.SCALE_SMOOTH)));
            b[71].setIcon(new ImageIcon(ImageIO.read(getClass().getResource("trapR.png")).getScaledInstance(150, 100, Image.SCALE_SMOOTH)));
            b[72].setIcon(new ImageIcon(ImageIO.read(getClass().getResource("trapR.png")).getScaledInstance(150, 100, Image.SCALE_SMOOTH)));
            b[73].setIcon(new ImageIcon(ImageIO.read(getClass().getResource("trapR.png")).getScaledInstance(150, 100, Image.SCALE_SMOOTH)));
            b[74].setIcon(new ImageIcon(ImageIO.read(getClass().getResource("trapR.png")).getScaledInstance(150, 100, Image.SCALE_SMOOTH)));
            b[75].setIcon(new ImageIcon(ImageIO.read(getClass().getResource("trapR.png")).getScaledInstance(150, 100, Image.SCALE_SMOOTH)));
            b[76].setIcon(new ImageIcon(ImageIO.read(getClass().getResource("trapR.png")).getScaledInstance(150, 100, Image.SCALE_SMOOTH)));
            b[77].setIcon(new ImageIcon(ImageIO.read(getClass().getResource("flagR.png")).getScaledInstance(150, 100, Image.SCALE_SMOOTH)));
            b[78].setIcon(new ImageIcon(ImageIO.read(getClass().getResource("lavaBeast.png")).getScaledInstance(150, 100, Image.SCALE_SMOOTH)));
            b[79].setIcon(new ImageIcon(ImageIO.read(getClass().getResource("lavaBeast.png")).getScaledInstance(150, 100, Image.SCALE_SMOOTH)));
        } catch (IOException ex) {
            Logger.getLogger(grafic.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    private ImageIcon getImageBack(){ //image for background
        try{
            return  new ImageIcon(ImageIO.read(getClass().getResource("grey2.png"))); //image
        }catch(IOException e){
            e.printStackTrace();
        }
        return null;
    }
    private ImageIcon getImageJock() { //image for joker
        try {
            return new ImageIcon(ImageIO.read(getClass().getResource("mageR.png")).
                    getScaledInstance(100, 80, Image.SCALE_SMOOTH)); //image
        } catch (IOException ex) {
            Logger.getLogger(grafic.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    /**
     *  a class which is used for doing some action after a card button has been pushed
     */
    private class CardListener implements MouseListener { 
         Controller con;
         
         CardListener(Controller con){
             this.con=con;
         }
        
        @Override
        public void mouseClicked(MouseEvent e) {
            JButton but = ((JButton) e.getSource());
            setbuttonClicked(but.getText());
            if(iconSelected && !but.equals(selectedButton)){ // move(swap) buttons
                int x=Integer.parseInt(but.getText());
                String p=selectedButton.getText();
                int y=Integer.parseInt(selectedButton.getText());
                int tmp1=Arrays.asList(b).indexOf(selectedButton);
                int tmp2=Arrays.asList(b).indexOf(but);
                System.out.println(this.con.board.arr[tmp1].getName() + " fights " + this.con.board.arr[tmp2].getName());
                String index1=Integer.toString(tmp1);
                String index2=Integer.toString(tmp2);
                boolean v=false;
                //--------------------
                int tmp=this.con.board.isEdgeBox(tmp1);
                boolean a=this.con.board.ValidMove(tmp1, tmp2, tmp);
                if(a==true){
                    if (this.con.board.arr[tmp2].getName()=="Empty") {
                        v=true;
                    }
                    int z=this.con.makeChanges(index1,index2,p);
                    if (z == 100) {
                        //System.out.println("Case A");
                        if (v==false) {
                            if (this.con.getTurn() == 0) {
                                this.con.board.lastDeletedText_Ever = but.getText();
                            } else {
                                this.con.board.lastDeletedText_Vol = but.getText();
                            }
                        }
                        but.setIcon(selectedButton.getIcon());
                        but.setName(JOKERNAME);
                        but.setText((selectedButton.getText()));
                        selectedButton.setIcon(getImageBack());
                        selectedButton.setBorder(BorderFactory.createLineBorder(Color.black));
                        selectedButton.setName(null);
                        selectedButton = but;
                        iconSelected = false;
                    }else if(z==101){
                        //System.out.println("Case B ");
                         if (v==false) {
                            if (this.con.getTurn() == 0) {
                                this.con.board.lastDeletedText_Vol = selectedButton.getText();
                            } else {
                                this.con.board.lastDeletedText_Ever = selectedButton.getText();
                            }
                        }
                        selectedButton.setIcon(getImageBack());
                        selectedButton.setBorder(BorderFactory.createLineBorder(Color.black));
                        selectedButton.setName(null);
                        selectedButton = but;
                        iconSelected = false;
                    }else if(z==102){
                        //System.out.println("Case G");
                        if (v == false) {
                            if (this.con.getTurn() == 0) {
                                this.con.board.lastDeletedText_Ever = but.getText();
                                this.con.board.lastDeletedText_Vol = selectedButton.getText();
                            } else {
                                this.con.board.lastDeletedText_Ever = selectedButton.getText();
                                this.con.board.lastDeletedText_Vol = but.getText();
                            }
                        }
                        but.setIcon(getImageBack());
                        but.setBorder(BorderFactory.createLineBorder(Color.black));
                        but.setName(null);
                        selectedButton.setIcon(getImageBack());
                        selectedButton.setBorder(BorderFactory.createLineBorder(Color.black));
                        selectedButton.setName(null);
                        iconSelected = false;   
                    }else{
                        //System.out.println("Case Ress");
                        if (v == false) {
                            if (this.con.getTurn() == 0) {
                                this.con.board.lastDeletedText_Ever = but.getText();
                            } else {
                                this.con.board.lastDeletedText_Vol = but.getText();
                            }
                        }
                        but.setIcon(selectedButton.getIcon());
                        but.setName(JOKERNAME);
                        but.setText((selectedButton.getText()));
                        selectedButton.setIcon(getImageBack());
                        selectedButton.setBorder(BorderFactory.createLineBorder(Color.black));
                        selectedButton.setName(null);
                        selectedButton = but;
                        if(this.con.getTurn()==0){
                            b[z].setText(this.con.board.lastDeletedText_Vol);
                        }else{
                            b[z].setText(this.con.board.lastDeletedText_Ever);
                        }
                        if(this.con.getTurn()==0){
                            try {
                                if (this.con.board.lastRessRank_Vol == 10) {
                                    b[z].setIcon(new ImageIcon(ImageIO.read(getClass().getResource("dragonR.png")).getScaledInstance(150, 100, Image.SCALE_SMOOTH)));
                                } else if (this.con.board.lastRessRank_Vol == 9) {
                                    b[z].setIcon(new ImageIcon(ImageIO.read(getClass().getResource("mageR.png")).getScaledInstance(150, 100, Image.SCALE_SMOOTH)));
                                } else if (this.con.board.lastRessRank_Vol == 8) {
                                    b[z].setIcon(new ImageIcon(ImageIO.read(getClass().getResource("knightR.png")).getScaledInstance(150, 100, Image.SCALE_SMOOTH)));
                                } else if (this.con.board.lastRessRank_Vol == 7) {
                                    b[z].setIcon(new ImageIcon(ImageIO.read(getClass().getResource("beastRiderR.png")).getScaledInstance(150, 100, Image.SCALE_SMOOTH)));
                                } else if (this.con.board.lastRessRank_Vol == 6) {
                                    b[z].setIcon(new ImageIcon(ImageIO.read(getClass().getResource("sorceressR.png")).getScaledInstance(150, 100, Image.SCALE_SMOOTH)));
                                } else if (this.con.board.lastRessRank_Vol == 5) {
                                    b[z].setIcon(new ImageIcon(ImageIO.read(getClass().getResource("lavaBeast.png")).getScaledInstance(150, 100, Image.SCALE_SMOOTH)));
                                } else if (this.con.board.lastRessRank_Vol == 4) {
                                    b[z].setIcon(new ImageIcon(ImageIO.read(getClass().getResource("elfR.png")).getScaledInstance(150, 100, Image.SCALE_SMOOTH)));
                                } else if (this.con.board.lastRessRank_Vol == 3) {
                                    b[z].setIcon(new ImageIcon(ImageIO.read(getClass().getResource("dwarfR.png")).getScaledInstance(150, 100, Image.SCALE_SMOOTH)));
                                } else if (this.con.board.lastRessRank_Vol == 2) {
                                    b[z].setIcon(new ImageIcon(ImageIO.read(getClass().getResource("scoutR.png")).getScaledInstance(150, 100, Image.SCALE_SMOOTH)));
                                } else if (this.con.board.lastRessRank_Vol == 1) {
                                    b[z].setIcon(new ImageIcon(ImageIO.read(getClass().getResource("slayerR.png")).getScaledInstance(150, 100, Image.SCALE_SMOOTH)));
                                }
                            } catch (IOException ex) {
                                Logger.getLogger(grafic.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }else{
                            try {
                                if (this.con.board.lastRessRank_Ever == 10) {
                                    b[z].setIcon(new ImageIcon(ImageIO.read(getClass().getResource("dragonB.png")).getScaledInstance(150, 100, Image.SCALE_SMOOTH)));
                                } else if (this.con.board.lastRessRank_Ever == 9) {
                                    b[z].setIcon(new ImageIcon(ImageIO.read(getClass().getResource("mageB.png")).getScaledInstance(150, 100, Image.SCALE_SMOOTH)));
                                } else if (this.con.board.lastRessRank_Ever == 8) {
                                    b[z].setIcon(new ImageIcon(ImageIO.read(getClass().getResource("knightB.png")).getScaledInstance(150, 100, Image.SCALE_SMOOTH)));
                                } else if (this.con.board.lastRessRank_Ever == 7) {
                                    b[z].setIcon(new ImageIcon(ImageIO.read(getClass().getResource("beastRiderB.png")).getScaledInstance(150, 100, Image.SCALE_SMOOTH)));
                                } else if (this.con.board.lastRessRank_Ever == 6) {
                                    b[z].setIcon(new ImageIcon(ImageIO.read(getClass().getResource("sorceressB.png")).getScaledInstance(150, 100, Image.SCALE_SMOOTH)));
                                } else if (this.con.board.lastRessRank_Ever == 5) {
                                    b[z].setIcon(new ImageIcon(ImageIO.read(getClass().getResource("yeti.png")).getScaledInstance(150, 100, Image.SCALE_SMOOTH)));
                                } else if (this.con.board.lastRessRank_Ever == 4) {
                                    b[z].setIcon(new ImageIcon(ImageIO.read(getClass().getResource("elfB.png")).getScaledInstance(150, 100, Image.SCALE_SMOOTH)));
                                } else if (this.con.board.lastRessRank_Ever == 3) {
                                    b[z].setIcon(new ImageIcon(ImageIO.read(getClass().getResource("dwarfB.png")).getScaledInstance(150, 100, Image.SCALE_SMOOTH)));
                                } else if (this.con.board.lastRessRank_Ever == 2) {
                                    b[z].setIcon(new ImageIcon(ImageIO.read(getClass().getResource("scoutB.png")).getScaledInstance(150, 100, Image.SCALE_SMOOTH)));
                                } else if (this.con.board.lastRessRank_Ever == 1) {
                                    b[z].setIcon(new ImageIcon(ImageIO.read(getClass().getResource("slayerB.png")).getScaledInstance(150, 100, Image.SCALE_SMOOTH)));
                                }
                            } catch (IOException ex) {
                                Logger.getLogger(grafic.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                        b[z].setName(JOKERNAME);
                        iconSelected = false;
                    }
                    /*System.out.println("last Text Ever : " + this.con.board.lastDeletedText_Ever);
                    System.out.println("last Text Vol : " + this.con.board.lastDeletedText_Vol);
                    System.out.println("place Ever : " + this.con.board.Ress_Piece_place_Ever);
                    System.out.println("place Vol : " + this.con.board.Ress_Piece_place_Vol);
                    System.out.println("Rank Ever : " + this.con.board.lastRessRank_Ever);
                    System.out.println("Rank Vol : " + this.con.board.lastRessRank_Vol);*/
                    this.con.changeTurn();
                }else{
                    System.out.println("INVALID MOVE");
                    iconSelected=false;//!!!!!!!!!!!!!!
                    selectedButton.setBorder(BorderFactory.createLineBorder(Color.black));
                }
                int k=this.con.GameEnded();
                if(k==1){
                    System.out.println("Everwinter has won!");
                    JOptionPane.showMessageDialog (null, "Everwinter has won!", "GAME OVER", JOptionPane.INFORMATION_MESSAGE);
                    for (int i = 0; i < 80; i++) {
                        for (MouseListener listener : b[i].getMouseListeners()) {
                            b[i].removeMouseListener(cl);
                        }
                    }
                }else if(k==2){
                    System.out.println("Volcandria has won!");
                    JOptionPane.showMessageDialog (null, "Volcandria has won!", "GAME OVER", JOptionPane.INFORMATION_MESSAGE);
                    for (int i = 0; i < 80; i++) {
                        for (MouseListener listener : b[i].getMouseListeners()) {
                            b[i].removeMouseListener(cl);
                        }
                    }
                }else{
                    System.out.println("Game continues");
                }
            }else if(!iconSelected && but.getName()!=null){ //if not selected icon is joker then select 
                if(((this.con.getTurn()==0)&&(Integer.valueOf(but.getText())>=50))||((this.con.getTurn()==1)&&(Integer.valueOf(but.getText())<30))){
                    iconSelected=true; //we can do without it, we can check for null selected button
                    selectedButton=but;
                    but.setBorder(BorderFactory.createLineBorder(Color.YELLOW,3));
                }else{
                    String player_turn_message;
                    if (this.con.getTurn()==0) {
                        player_turn_message = "Turn of Volcandria to play!";
                    }else{
                        player_turn_message = "Turn of Everwinter to play!";
                    }
                    JOptionPane.showMessageDialog (null, player_turn_message, "Wrong Turn", JOptionPane.INFORMATION_MESSAGE);
                }
            }else{ //if already selected or not selected at all
                if(iconSelected){
                    System.out.println("Already Selected");
                }else{
                    System.out.println("Not selected");
                }
            }
           System.out.println("--------------------------------------------");
        }

        @Override public void mousePressed(MouseEvent e) {}

        @Override public void mouseReleased(MouseEvent e) {}

        @Override public void mouseEntered(MouseEvent e) {}

        @Override
        public void mouseExited(MouseEvent e) {
        }
        
    }
     

    /**
     * function used to print buttons
     */
    public void printButtons(){
        //this.b[1].setText(Integer.toString(100));
        for(int i=0;i<80;i++){
                System.out.println("Button: " + i + " ,id : " + this.b[i].getText());
            }
    }     
        
    
    /**
     * returns the text of a button
     * @param i
     * @return 
     */
    public String getButtonText(int i){
        return this.b[i].getText();
    }
    
    public static String JOKERNAME="Joker";
    
    public void setbuttonClicked(String x){
        buttonClicked=x;
    }
    
    
    
        
        
}
