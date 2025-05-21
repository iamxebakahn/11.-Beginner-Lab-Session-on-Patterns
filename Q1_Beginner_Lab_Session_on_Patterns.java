/*Problem Description
Take an integer N, print the corresponding Full Pyramid pattern for N.
For example if N = 5 then pattern will be like:

    * 
   * * 
  * * * 
 * * * * 
* * * * * 
NOTE: There should be exactly one extra space after each * for each row.
Problem Constraints
2 <= N <= 100
Input Format
First and only line of input contains a single integer N.
Output Format
Output the Full Pyramid pattern corresponding to the given N.
Example Input
Input 1:
 2
Input 2:
 3
Input 3:
 4
Example Output
Output 1:
  * 
 * * 
Output 2:
   * 
  * * 
 * * * 
Output 3:
    * 
   * * 
  * * * 
 * * * *  */
import java.lang.*;
import java.util.*;

public class Q1_Beginner_Lab_Session_on_Patterns{
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        for(int i=1;i<=N;i++)
        {
            for(int l=0;l<N-i;l++)
                System.out.print(" ");

            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
                // System.out.print(" ");
                
            }
            System.out.println();
        }
    }
}