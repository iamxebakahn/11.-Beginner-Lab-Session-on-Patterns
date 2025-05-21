/*Problem Description

You are given an integer N you need to print all the Armstrong Numbers between 1 to N. (N inclusive).

If sum of cubes of each digit of the number is equal to the number itself, then the number is called an Armstrong number.

For example, 153 = ( 1 * 1 * 1 ) + ( 5 * 5 * 5 ) + ( 3 * 3 * 3 ).

Note: All the test cases in this problem are limited to 3 digit numbers.



Problem Constraints

1 <= N <= 500



Input Format

First and only line of input contains an integer N.



Output Format

Output all the Armstrong numbers in range [1,N] each in a new line.



Example Input

Input 1:

 5
Input 2:

 200


Example Output

Output 1:

1
Output 2:

1
153 */
import java.lang.*;
import java.util.*;

public class Q5AP_Beginner_Lab_Session_on_Patterns{
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int num,i=1;
        int digit, arm_strong_sum;

        while(i<=N)
        {
            num=i;
            arm_strong_sum=0;
            while(num>0)
            {
                digit=num%10;
                arm_strong_sum=arm_strong_sum+(digit*digit*digit);
                num/=10;
            }

            if(i==arm_strong_sum)
                System.out.println(i);

            i++;
        }
    
    }
}