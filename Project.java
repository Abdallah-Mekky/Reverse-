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
    
















//    public static int k (int a, int b) {
//  if (a < b) { // a=6 b=6
//                 if (b > 4) {
//                  return 0 ; }
//                  else {return 1;}
//  }
//  else {
//                       if (a > 4) {
//                            return 2 ;}
//                        else {return 3;}
//  } 
//}
//        double M ,P,r;int n;
//        Scanner S = new Scanner(System.in);
//        System.out.println(" Enter Your principal ");
//        P=S.nextDouble();
//        System.out.println(" Enter Your Monthly Interest Rate ");
//        r=(S.nextDouble()/0.12);
//        System.out.println(" Enter The Numbers Of Months ");
//        n=S.nextInt();
//        M= P*((r*Math.pow(1+r,n))/(Math.pow(1+r,n)-1));
//        System.out.println(" Your Monthly Payment Is " + M);
//       System.out.println(k(6, 6));   
//String R, Reverse="";
//        Scanner S = new Scanner(System.in);
//        System.out.println(" Enter String To Reverse ");
//       R=S.nextLine();
//       for(int i= R.length()-1;i>=0;i--){
//       Reverse +=  R.charAt(i);}
//           System.out.println(Reverse);
//           }
//          }
//      
