/*Problem Description

Take an integer N as input, print the corresponding pattern for N.

For example if N = 4 then pattern will be like:

1
1 2
1 2 3
1 2 3 4

NOTE: There should be no extra spaces after last integer.


Problem Constraints

1 <= N <= 100
Input Format

First and only line of input contains a single integer N.

Output Format

Output the pattern corresponding to the given N.

NOTE:

There should be no extra spaces after last integer and before first integer in any row.
All integers in any row in the pattern are space separated.

Example Input

Input 1:
 2
Input 2:
 3

Example Output

Output 1:
1
1 2
Output 2:

1
1 2
1 2 3 */
import java.lang.*;
import java.util.*;

public class Q3_Beginner_Lab_Session_on_Patterns{
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        for(int i=1;i<=N;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
                if(j!=i)
                   System.out.print(" ");
                
            }
            System.out.println();
        }
    }
}