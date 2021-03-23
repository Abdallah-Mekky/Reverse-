package project1;
import java.util.Scanner;
public class Project1 {
public static void main(String[] args) {
 String Str1,Str2, reverse1 = "" ,reverse2= "";
    Scanner M = new Scanner(System.in);
    System.out.println(" Enter A String To Reverse ");
    Str1 = M.next();
    Str2 = M.nextLine();  
    for (int i = Str1.length() - 1 ; i >= 0 ; i--){
      reverse1 = reverse1 + Str1.charAt(i);}
    for(int i = Str2.length() - 1 ; i >= 0 ; i--){
    reverse2 = reverse2 + Str2.charAt(i);} 
    System.out.println(" The Reverse Is " + reverse1 + " " + reverse2 + " ");
    }} 
