
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Basma
 */
public class reviews_controller  {
Scanner in=new Scanner(System.in);
reviews R = new reviews();

Database db=new Database();
//reviewFunctiona rf1=new reviewFunctiona();


public void review(String x,String y){
 if( x.compareTo("") != 0&&y.compareTo("") != 0){
System.out.println("your review has submitted successfully ");
  db.Insertreview(x,y);}
 else 
    {System.out.println("fill them first then press the button");}}


public void display(String z){
String x=db.viewreviews(z);

}


public void comment(String x,String y){
   if(x.compareTo("") == 0||y.compareTo("")==0)
   {System.out.println("fill them first then press the button");}
   else{
System.out.println("your comment has submitted successfully ");
       db.InsertComment(x,y);
    }
    
    

} 
public void like( String x){
     if(x.compareTo("") == 0)
     {
        System.out.println("u must enter the review no.");
     }
   else{ System.out.println("your action is done ");
   int z=Integer.parseInt(x);
         db.Insertlikes(z);
         
     }} 


}