
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nour
 */
public class Competition{
    public int points;
   public String comp1,comp2;
    Scanner in=new Scanner(System.in);
  Database db5=new Database();

    public void setComp2(String comp2) {
        this.comp2 = comp2;
    }

    public void setComp1(String comp1) {
        this.comp1 = comp1;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public String getComp2() {
        return comp2;
    }

  

    public int getPoints() {
        return points;
    }

    public String getComp1() {
        return comp1;
    }

    public void startcompitition(String n1,String e1,String n2,String e2,String bn){
     if( n1.compareTo("") != 0||n2.compareTo("") != 0||e2.compareTo("") != 0||e1.compareTo("") != 0||bn.compareTo("") != 0){
  db5.startcompetition(n1,e1,n2,e2,bn);
  }
 else 
    {System.out.println("fill them first then press the button");}
 
    }
}
