package studentdriver;


import java.util.*;

public class StudentDriver {
    public static void main(String[] args) {
//main code goes here
Scanner input = new Scanner(System.in);

System.out.println("Enter the no of UG students: );   
String num_of_UG_students = input.nextLine();

System.out.println("Enter the no of Graduate students: );   
String num_of_grad_students = input.nextLine();

System.out.println("Enter the no of online students: );   
String num_of_online_students = input.nextLine();

System.out.println("**********Undergraduate students list**********");   

//list out undergraduate student infomation

System.out.println("**********Graduate students list**********"); 

//list out graduate student infomation   

System.out.println("**********Online students list**********");   

//list out online student infomation        

System.out.println("**********Undergraduate Students details***********");   
System.out.println("**********Graduate Students details**********");   
System.out.println("**********Online Students details**********");   
    
    }
}
