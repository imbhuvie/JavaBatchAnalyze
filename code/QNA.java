// Question 1: One feet=12.0 inches, one inch=2.54 centimeters, write a program to compute 
// inches and feet of input value (in cms).
// Question 2: the following table shows the employee code and percentage of bonus for value of 
// Basic Pay. 
// Employee Code, Bonus
// 100, 5
// 200, 1
// 300, 2
// 400, 25 
// Write the Switch statement to find the bonus for the employee code.
// Question 3: Write a program get the input mark from user through keyboard check the following 
// condition.
// If Mark<40 – Fail, > 50 – good, >75 - very good, >90.
// Question 4: Write a program to get the month number from the user (1…12), print the name of 
// the month, If input is > 12 then print “Hey! That’s not a valid month”.
// Question 5: Write a program to find sum of all Prime Numbers in range of 1 to n (n is input by 
// key board).
// Question 6: Compare and contrast while and do – while with Example.
// Question 7: the numbers 153,370,371 has special property. The sum of cubes of the individual 
// digits gives the same number. Write a program to find the Armstrong number from 100 to n.
// Question 8: A frog starts climbing 30 ft well. Each hour frog climbs 3 ft and slip back 2 ft. How 
// many hours does it take him to reach top and get out. Implement this using Program.
// Question 9: Write a program to find the sum of digit.
// Question 10: What is Type Casting? Give example.
// Question 11: what will be the output of the following code?
// Class ABC
// {
// Public static void main(String args[] ) 
// {
// int i, j;
// outer:
// for (i=0;i<3;i++)
// }
// inner: for (j=0;j<3;j++)
// {
// if(j = = 2)
// continue outer; 
// System.out.println (“i”+i+”j”+j); 
// } 
// }

import java.util.Scanner;

public class QNA {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter Value in cm :");
        // double valueInCm = sc.nextDouble();
        // double inInch = valueInCm / 2.54;
        // double inFeet = valueInCm / 12;
        // System.out.println("Value in cm :" + valueInCm);
        // System.out.println("Value in Inch :" + inInch);
        // System.out.println("Value in Feet :" + inFeet);

        // =================================
        GetBonus emp=new GetBonus();
        double bonus=emp.getBonusSalary(300,100);
        System.out.println(bonus);
    
    }
}
class GetBonus{
    double empSalary;
    double empCode;
    public double getBonusSalary(double empCode,double empSalary){
            if(empCode==100){
                return empSalary*0.05;
            }
            else if(empCode==200){
                return empSalary*0.01;
            }
            else if(empCode==300){
                return empSalary*0.02;
            }
            else if(empCode==400){
                return empSalary*0.25;
            }
            return 0;
    }
}
