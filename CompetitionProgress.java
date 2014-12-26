
import java.util.Scanner;


public class CompetitionProgress {
 Competition c;
 String bookname,winner;
 int page1,page2;
   Database db6=new Database();
Scanner in=new Scanner(System.in);
    public void setPage1(int page1) {
        this.page1 = page1;
    }

    public void setPage2(int page2) {
        this.page2 = page2;
    }

    public void setWinner(String winner) {
        this.winner = winner;
    }

    public String getWinner() {
        return winner;
    }
    

    public int getPage1() {
        return page1;
    }

    public int getPage2() {
        return page2;
    }


    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getBookname() {
        return bookname;
    }
    
    
    
    
 public void howfarfrom(){




    

 } 

    void updatecompetition(String comp1, String mail1, String bookn,String pages) {
     db6.updatecompetition(comp1,mail1,bookn,pages);
    }
}
