//package java;

//import java.util.*;
//package com.company;
public class first {
  public static void main(String[] args) {
    /*
     * System.out.println("helloWorld");
     * // int a=10;
     * // int b=23;
     * // System.out.println(a-b);
     * //Scanner sc1 = new Scanner(System.in);
     * //int num1 = sc1.nextInt();
     * //int num2=sc1.nextInt();
     * //System.out.println("sum is num1 and num2 = "+(num1+num2));
     * int a=10;
     * System.out.println(a);
     * System.out.println(Character.isLetter('A'));
     * System.out.println(Character.isLetter('0'));
     * //boolean isWhitespace(char ch)
     * System.out.println(Character.isWhitespace('A'));
     * System.out.println(Character.isWhitespace(9));
     * // Lower case
     * System.out.println(Character.toLowerCase('A'));
     * System.out.println(Character.toLowerCase(65));
     * // value find in java
     * char c1=67;
     * int p='c';
     * System.out.println(c1);
     * System.out.println(p);
     */
    // Array in java;
    /*
     * int[] mark = new int[3];
     * mark[0]=23;
     * mark[1]=8;
     * mark[2]=13;
     * for(int i=0;i<3;i++){
     * System.out.println(mark[i]);
     * }
     * 
     * Scanner sc = new Scanner(System.in);
     * int size = sc.nextInt();
     * int[] mark = new int[size];
     * for(int i=0;i<size;i++){
     * mark[i] = sc.nextInt();
     * }
     * for(int i=0;i<mark.length;i++){
     * if(mark[i]%2==0)
     * System.out.println(mark[i]);
     * }
     * // **************type casting*****************
     * byte p=100;
     * int i=p;
     * System.out.println(i);
     * char c='A';
     * double x=c;
     * System.out.println(x);
     * // here use nornaning method then use (byte) otherwise show wrong
     * int d=10;
     * byte a=(byte)d;
     * System.out.println(a);
     * var w="prince";
     * System.out.println(w);
     * 
     * // *********Statement and Block***********
     * String a="qa";
     * System.out.println(a);
     * {
     * String b="sc";
     * System.out.println(b+a);{
     * String c="pe";
     * System.out.println(c+b+a);
     * }
     * }
     * // dowhile loop
     * Scanner reader = new Scanner(System.in);
     * int number=0;
     * 
     * do{
     * System.out.println("enter the 10 multi of num: ");
     * number = reader.nextInt();
     * }
     * while (!(number%10==0));
     */
    /*
     * int arr[]={2,30,4,6,9,12,17};
     * for(int i=0;i<arr.length;i++){
     * Boolean flag=true;
     * for(int j=2;j<arr[i];j++){
     * if(arr[i]%j==0){
     * flag=false;
     * break;
     * }
     * }
     * if(flag)
     * System.out.println(arr[i]);
     * }
     */
    /*
     * String firstName = "Tony";
     * String secondName = "Stark";
     * String fullName = firstName + " " + secondName;
     * System.out.println(fullName.length());
     * // 10 (all+gap vi);
     */
    /*
     * //The substring of a string is a subpart of it.
     * 
     * String name = "TonyStark";
     * System.out.println(name.substring(0, 4));
     * String str = "123";
     * int number = Integer.parseInt(str);
     * System.out.println(number+2);
     */
    /*
     * // exchange of e in postion i;
     * Scanner sc = new Scanner (System.in);
     * String str = sc.next();
     * String bag = "";
     * 
     * for(int i=0; i<str.length(); i++) {
     * if(str.charAt(i) == 'e') {
     * bag += 'i';
     * } else {
     * bag += str.charAt(i);
     * }
     * }
     * System.out.println(bag);
     */
    /*
     * //**************StringBulder**************;
     * StringBuilder sb = new StringBuilder("tony");
     * System.out.println(sb);
     * System.out.println(sb.charAt(0));
     * //set char at index in possition;
     * sb.setCharAt(0, 'p');
     * System.out.println(sb);
     * // insert or add extra word in string;
     * sb.insert(0, 'S');
     * System.out.println(sb);
     * // Spony --- move--- Stoy (change in string)
     * sb.delete(3, 4);
     * System.out.println(sb);
     */
    // A 1-D Array
    int[][] flats;
    flats = new int[2][3];
    flats[0][0] = 101;
    flats[0][1] = 102;
    flats[0][2] = 103;
    flats[1][0] = 201;
    flats[1][1] = 202;
    flats[1][2] = 203;
    System.out.println("Printing a 2-D array using for loop");
    for (int i = 0; i < flats.length; i++) {
      for (int j = 0; j < flats[i].length; j++) {
        System.out.print(flats[i][j]);
        System.out.print(" ");
      }
      System.out.println("");
    }

  }
}