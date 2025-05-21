/*Problem Description

Take an integer N as input, print the corresponding pattern for N.

For example if N = 5 then pattern will be like:

*****
_****
__***
___**
____*
Note : Here '_' represents space for explanation purpose only. You have to print space in your code.



Problem Constraints

1 <= N <= 100



Input Format

First and only line of input contains a single integer N.



Output Format

Output the pattern corresponding to the given N.



Example Input

Input 1:

 2
Input 2:

 3


Example Output

Output 1:

**
_*
Output 2:

 
 ***
 _**
 __*
Note : Here '_' represents space for explanation purpose only. You have to print space in your code. */
import java.lang.*;
import java.util.*;

public class Q4AP_Beginner_Lab_Session_on_Patterns{
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        for(int i=N;i>=1;i--)
        {
            for(int l=1;l<=N-i;l++)
                System.out.print(" ");

            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
                // System.out.print(" ");
                
            }
            System.out.println();
        }
    }
    
}