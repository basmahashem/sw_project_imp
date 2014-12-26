
//import com.mysql.jdbc.Connection;
//import com.mysql.jdbc.Statement;
import java.sql.*;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nour
 */
public class Database {
    private  Connection Co;
    private Statement St;
    private ResultSet Re;
    public int no;
    public String totaldata;
    public int x=0;
    public  String n1;
    public   String n2;
//public String book_id;
    public Database()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Co = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/GoodReads" , "root" , "");
            St = (Statement) Co.createStatement();
        }
        catch(Exception Ex)
        {
            System.out.println("Error" + Ex);
        }
    }
 public void Log_in(String em,String pass)
        {try
            {//eastyphp email,password small
                String query = "select email and password from User where email='"+em+"' and password='"+pass+"'";
                Re = St.executeQuery(query);
               // System.out.println("Records from GoodReads");
                while(Re.next())
                {
                    String email = Re.getString("email");
                      String password = Re.getString("password");
                   
                }
            }
            catch(Exception ex)
            {
                System.out.println(ex);
            }
}
 void sign_up(String fn, String ln, String em, String p, String cp) {
     String uname=fn+" "+ln;
        String InsertTable = "insert into User" + "(FName , LName , email,password,con_password,username) " + "values" + "('" +fn+ "','" +ln+ "','" +em+ "','" +p+ "','" +cp+ "','"+uname+"')";
        try
        {
            St.executeUpdate(InsertTable);
            System.out.println("Record is inserted into User table!");
        }
        catch(Exception Ex)
        {
            System.out.print(Ex);
        }
    }
   

    public void UpdateInfo(String username , String pass,String cpass,String e_mail)
    {
        String UpdateTable = "update User set username and password and con_password = '"+username+"','"+pass+"','"+cpass+"' where email ='"+e_mail+"'";
        try
        {
            St.executeUpdate(UpdateTable);
            System.out.println("Record is updated to User table!");
        }
        catch(Exception Ex)
        {
            System.out.print(Ex);
        }
    }
   void search_book(String book_name) {
       User u=new User();
       try
            {//eastyphp email,password small
                String query = "select Auther from Book where Name='"+book_name+"'";
                Re = St.executeQuery(query);
               // System.out.println("Records from GoodReads");
                while(Re.next())
                {
                   
                     u.auther_n = Re.getString("Auther");
               x++;    
                }
                System.out.println(" book name :"+book_name);
                   System.out.println(" auther name :"+u.auther_n);
                      System.out.println(" number of entering :"+x);
            }
            catch(Exception ex)
            {
                System.out.println(ex);
            }
        }
   // ADD FRIEND LSAHTT3ML 
   
//***************************************************************************MAI SHALAN*********************************************************88
   
public void InsertBook(String Bname , String Bauther,String page_no){
//MAX_ID
          String id="";
          int a=0;
            try
            {
                String query = "SELECT MAX(book_id) AS book_id FROM Book;";// creat in database coloumn called book_id
                Re = St.executeQuery(query);
                //System.out.println("Records from GoodReads");
                while(Re.next())
               {
                     id = Re.getString("book_id");
                    //System.out.println("id:" + id);
                }
                 a = Integer.parseInt(id);
                a=a+1;
                System.out.println(a);
           
                
                String InsertTable = "insert into Book" + "(Name,Auther,page_no,book_id) " + "values"
                              + "('" +Bname+ "','"+Bauther+"','"+page_no+"','"+a+"')";
            try
            {
                St.executeUpdate(InsertTable);
                System.out.println("Record is inserted into User table!");
            }  
            
            catch(Exception ex)
            {   System.out.println(ex);} }  
        catch(Exception ex)
            {   System.out.println(ex);}
            
             
            }    
    public void DeleteBook(String Name)
    {
        String DeleteTable = "delete from Book where Name = '"+Name+"'";
        try
        {
            St.executeUpdate(DeleteTable);
            System.out.println("Record is deleted from Book table!");
        }
        catch(Exception Ex)
        {
            System.out.print(Ex);
        }
    }
    public void InsertRate(String Rate,String name)
    {
        String updateTable = "update Book set Rate = '"+Rate+"' where Name = '"+name+"'";
           
        try
        {
            St.executeUpdate(updateTable);
            System.out.println("Record is inserted into Rate table!");
        }
        catch(Exception Ex)
        {
            System.out.print(Ex);
        }
    }

    public void getBooks()
    {
        try
        {
            String query = "select * from Book";
            Re = St.executeQuery(query);
            System.out.println("Records from GoodReads");
            while(Re.next())
            {
                String Books = Re.getString("Name");
                System.out.println("Name:" + Books);
            }
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
    }
//*************************************************************NOURHAN EZZET**********************************************************
    public void InsertShelve(String Sname , String Stype , String Sstate)
    {
        String InsertTable = "insert into Shelve " + "(Name , Type , State) "+ "values" + "('" +Sname+ "','" +Stype+ "','" +Sstate+ "')";
        try
        {
            St.executeUpdate(InsertTable);
            System.out.println("Record is inserted into Shelve table!");
        }
        catch(Exception Ex)
        {
            System.out.print(Ex);
        }
    }

    public void EditShelve(String Sname , String Stype)
    {
        String UpdateTable = "update Shelve set Name = '"+Sname+"' where Type = '"+Stype+ "'";
        try
        {
            St.executeUpdate(UpdateTable);
            System.out.println("Record is updated to Shelve table!");
        }
        catch(Exception Ex)
        {
            System.out.print(Ex);
        }
    }

    public void DeleteShelve(String State , String Name)
    {
        String DeleteTable = "delete from Shelve where State = '"  +State+ "Name = '"  +Name+ "'";
        try
        {
            St.executeUpdate(DeleteTable);
            System.out.println("Record is deleted from Shelve table!");
        }
        catch(Exception Ex)
        {
            System.out.print(Ex);
        }
    }

    

    public void InsertGroup(String Name)
    {
        String InsertTable = "insert into Group " + "(Name) " + "values"  + "('" +Name+ "')";
        try
        {
            St.executeUpdate(InsertTable);
            System.out.println("Record is inserted into Group table!");
        }
        catch(Exception Ex)
        {
            System.out.print(Ex);
        }
    }
    
  //*******************************************************************************************************************************
       //*****************************************BASMA AHMED***************************************************************************
      
       
 
   
            public void Insertreview(String review,String book_name)
        {//MAX_ID
          String id="";
          int a=0;
          
           try{
        
        
          String query1 = "select book_id from Book where Name='"+book_name+"'";
                Re = St.executeQuery(query1);
                System.out.println("Executed");
         while(Re.next())
                {
            id = Re.getString("book_id");
              no=Integer.parseInt(id);
                }
   
            try
            {
                String query = "SELECT MAX(review_no) AS review_no FROM Reviews;";
                Re = St.executeQuery(query);
                //System.out.println("Records from GoodReads");
                while(Re.next())
               {
                     id = Re.getString("review_no");
                    //System.out.println("id:" + id);
                }
                 a = Integer.parseInt(id);
                a=a+1;
                System.out.println(a);
       
                
                String InsertTable = "insert into Reviews" + "(u_review,review_no,book_id) " + "values"
                              + "('" +review+ "','"+a+"','"+no+"')";
            try
            {
                St.executeUpdate(InsertTable);
                System.out.println("Record is inserted into User table!");
            }  
            
            catch(Exception ex)
            {   System.out.println(ex);} }  
        catch(Exception ex)
            {   System.out.println(ex);}
            
           }
            catch(Exception ex)
            {   System.out.println(ex);}
            } 
   public void Insertlikes(int i)
        {
            
             try
            {
                String query = "select like_r from Reviews where review_no='i'";
                Re = St.executeQuery(query);
              //  System.out.println("Records from GoodReads");
                while(Re.next())
                {
                   String likes = Re.getString("liker_r");
                  no=Integer.parseInt(likes);
                }
                
                no=no+1;
               String UpdateTable = "update Reviews set like_r = '"+no+"' where review_no = '"+i+"'";
        
            try
            {
                St.executeUpdate(UpdateTable);
                System.out.println("Record is inserted into User table!");
            }
            
             
            catch(Exception ex)
            {
                System.out.println(ex);
            }  
            }
            
            catch(Exception Ex)
            {
                System.out.print(Ex);
            }
        } 

           
    public void InsertComment(String comment,String id) {
        
          
                     
      
            String InsertTable = "update Reviews set comment_r ='" +comment+ "' where review_no = '"+id+"'";
                 
            try
            {
                St.executeUpdate(InsertTable);
                System.out.println("Record is inserted into User table!");
            }
            catch(Exception Ex)
            {
                System.out.print(Ex);
            }   
       }

    String viewreviews(String bookname) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    try{
        
        
          String query1 = "select book_id from Book where Name='bookname'";
                Re = St.executeQuery(query1);
         while(Re.next())
                {
                   String book_id = Re.getString("book_id");
                  no=Integer.parseInt(book_id);
                }
        
        
        try
            {                String query = "select * from Reviews where book_id='no'";

                Re = St.executeQuery(query);
               // System.out.println("Records from GoodReads");
                while(Re.next())
                {
                     String data1 = Re.getString("u_review");
                    System.out.println("review:" + data1+"  ");
                     String data2 = Re.getString("comment_r");
                    System.out.println("comment:" + data2+"  ");
                     String  data3 = Re.getString("like_r");
                    System.out.println("no.of likes:" + data3);
                     String  data4 = Re.getString("review_no");
                    System.out.println("review no:" + data4);
                     String  data5 = Re.getString("book_id");
                    System.out.println("book id:" + data5); 
               // totaldata+="  review:   "+data1+"\n  comment:   "+data2+"\n  no.of likes:    "+data3+"\n  review no:   "+data4+"\n"+"  book_no:   "+data5+"";
                  
                }
                
            }
            catch(Exception ex)
            {
                System.out.println(ex);
            }
       
     //  return totaldata; 
    }
    catch(Exception ex)
            {
                System.out.println(ex);
            }

return null; 
    }

    void startcompetition(String n1, String e1, String n2, String e2,String bn) {
       String id="";   
       int a=0;
       try
            {  
                  try
            {
                String query1 = "SELECT MAX(compition_id) AS compition_id FROM competition;";
                Re = St.executeQuery(query1);
                //System.out.println("Records from GoodReads");
                while(Re.next())
               {
                     id = Re.getString("compition_id");
                    //System.out.println("id:" + id);
                }
                 a = Integer.parseInt(id);
                a=a+1;
                
                
                
                String query = "select book_id from Book where Name='"+bn+"'";

                Re = St.executeQuery(query);
               // System.out.println("Records from GoodReads");
                while(Re.next())
                {
                     String book_id = Re.getString("book_id");
          no=Integer.parseInt(book_id);
                }
               
            }
            catch(Exception ex)
            {
                System.out.println(ex);
            }
             String InsertTable = "insert into competition" + "(name1,mail1,name2,mail2,bookname,book_id) " + "values"
                              + "('" +n1+ "','" +e1+ "','"+n2+"','" +e2+ "','" +bn+ "','"+no+"')";
            try
            {
                St.executeUpdate(InsertTable);
                System.out.println("Record is inserted into User table!");
            }  
            
            catch(Exception ex)
            {   System.out.println(ex);} 
            }
    catch(Exception ex)
            {   System.out.println(ex);}
    }

    void updatecompetition(String comp1, String mail1, String bookn,String pages) {
      int i=0;
      int j=0;
        try{String query = "select compition_id and bookpages from competition where name1='"+comp1+"' and mail1='"+mail1+"' or name2='"+comp1+"' and mail2='"+mail1+"'";

                Re = St.executeQuery(query);
               // System.out.println("Records from GoodReads");
                while(Re.next())
                {
                     String comp_id = Re.getString("compition_id");
                     String bookpages = Re.getString("bookpages"); 
          no=Integer.parseInt(comp_id);
          i=Integer.parseInt(bookpages);
                }
          j=Integer.parseInt(pages);      
           if(i==j){
                
                  String InsertTable = "insert into compprogress" + "(name,pages,compition_id,winner) " + "values"
                              + "('" +comp1+ "','" +pages+ "','"+no+"','" +comp1+ "')";
            try
            {
                St.executeUpdate(InsertTable);
                System.out.println("Record is inserted into User table!");
            }  
            
            catch(Exception ex)
            {   System.out.println(ex);} 
            }
        
        else{    
               String n="";
               String InsertTable = "insert into compprogress" + "(name,pages,compition_id,winner) " + "values"
                              + "('" +comp1+ "','" +pages+ "','"+no+"','" +n+ "')";
            try
            {
                St.executeUpdate(InsertTable);
                System.out.println("Record is inserted into User table!");
            }  
            
            catch(Exception ex)
            {   System.out.println(ex);} 
            }
        }    
            catch(Exception ex)
            {
                System.out.println(ex);
            }
    }
}
   

   

    
   


   

