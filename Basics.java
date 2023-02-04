import java.util.Scanner; //input cls

public class Basics {
    public static void main(String[] args) {

        System.out.println("Hello World ! "); // *ln* gives a space of line

        //basic pattern :-

        // System.out.println("****");
        // System.out.println("***");
        // System.out.println("**");
        // System.out.println("*");

        //variable initialization :-
        // int a =1;
        // int b =2;

        //print in java:-
        // System.out.println(a);
        // System.out.println(b);

        // a=3;
        // System.out.println(a);

        // primitive DT

        // byte b=8;
        // System.out.println(b);
        // char ch = 'h';
        // System.out.println(ch);
        // boolean var = true;
        // System.out.println(var);
        // float price = (float) 10.4;
        // int num =23;
        // long
        // double
        // short n =230;
        // System.out.println(n);

        // input
        // Scanner sc = new Scanner(System.in);
        // String input =sc.next ();
        // System.out.println(input);
        // String name = sc.nextLine();
        // System.out.println(name);
        // int num = sc.nextInt();
        // System.out.println(num);
        // Scanner sc = new Scanner(System.in);
        // boolean bool = sc.nextBoolean();
        // System.out.println(bool);

        // sum

        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int sum = a+b;

        // System.out.println(sum);

        // product

        // Scanner sc=new Scanner(System.in);
        // int a = sc.nextInt();
        // int b =sc.nextInt();
        // int product = a*b;

        // System.out.println(product);

        // Area of Circle

        // float r = sc.nextFloat();
        // float area = 3.14f*r*r;
        // System.out.println(area);

        // int a =2324243;
        // float b = (float)(a);// TYPE CASTING
        // System.out.println(b);

        // type promotion in java 
        /*
         * 1. byte ,short,char ---> int
         * 2. long float or double -->long
         * 
         * this is for lossy conversion.
         */

        // Operators
        // int a =10;
        // int b=4;
        // System.out.println(a+b);
        // int a =10;
        // System.out.println(++ a);

        // Conditional Statement

        //print the largest of 2

        // int a =19;
        // int b =90;
        // if ( a>b)
        // System.out.println(a);
        // else
        // System.out.println(b);

        // Qs.1 no even or odd

        // int a =4;
        // if ( a%2==0){
        // System.out.println("Even");
        // }else{
        // System.out.println("Odd");
        // }

        // Qs.2 income tax calculator
        // Scanner sc = new Scanner(System.in);
        // int income = sc.nextInt();
        // int tax=0;
        // if (income<500000){
        // System.out.println("0% tax");
        // tax =0;
        // }else if(income>500000 || income<1000000){
        // System.out.println("20% tax");
        // tax=(int)(income * 0.2);
        // }else if ( income>1000000){
        // System.out.println("30% tax");
        // tax =(int)(income*0.3);
        // }
        // System.out.println("Tax is :"+ tax +"%");

        // Largest number
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int c = sc.nextInt();

        // if ((a>=b)&&(a>=c)){
        // System.out.println("A is Largest !");
        // }
        // else if (b>=c){
        // System.out.println("B is Largest");
        // }
        // else{
        // System.out.println("C is Largest");
        // }

        // Ternary Operator
        // int a =1;
        // a=(1>3)?1:3;
        // System.out.println(a);
        // int marks = 35;
        // String status =(marks>=33)?"PASS":"FAIL";
        // System.out.println(status);

        // Switch case

        // int number =3;
        // switch(number){
        // case 1:
        // System.out.println("Samosha");
        // break;

        // case 2:
        // System.out.println("Fulki");
        // break;

        // default:
        // System.out.println("Pani");
        // }

        //calculator

        // System.out.println(number);
        // Scanner sc = new Scanner (System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // char Operator = sc.next().charAt(0);

        // switch(Operator){
        // case'+':System.out.println(a+b);break;
        // case'-':System.out.println(a-b);break;
        // case'*':System.out.println(a*b);break;
        // case'/':System.out.println(a/b);break;
        // case'%':System.out.println(a%b);break;

    }

}

// Boilerplate code