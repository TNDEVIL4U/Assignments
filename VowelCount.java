import java.util.Scanner;

public class VowelCount {

 public static void main(String[] args) {

 System.out.println("Name : T S 

Bhuvaneshwar\nRoll No: 2024503565");

 String input;

 System.out.print("Enter the string : ");

 Scanner sc = new Scanner(System.in);

 input=sc.nextLine();

 input= input.toLowerCase();

 int[] count = new int[5];

 for(int i=0;i<input.length();i++)

 {

 char ch = input.charAt(i);
switch(ch){

 case 'a':

 count[0]++;

 break;

 case 'e':}

 count[1]++;

 break;

 case 'i':

 count[2]++;

 break;

 case 'o':

 count[3]++;

 break;

 case 'u':

 count[4]++;

 break;

 } }

 System.out.println("Frequency of vowel a 

is "+count[0]+"\nFrequency of vowel e is 

"+count[1]+"\nFrequency of vowel i is 

"+count[2]+"\nFrequency of vowel o is 

"+count[3]+"\nFrequency of vowel u is 

"+count[4]);}}
