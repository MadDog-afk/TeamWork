package Recursion;
 
import java.util.Scanner;
public class TeamWork {
    // n = number of disk to be move rodOne where the disk is present rodThree where the disk to be move rodTwo is the remaining one 
    static void H(int n, char rodOne, char rodThree, char rodTwo) 
    { 
        //lawrence
        
 
    } 
     
    public static void main(String args[]) 
    { 
        // Ask the User of Number of disks 
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Number of disk/s: ");
        int n  = scan.nextInt();
        scan.close();
 
        System.out.println(" ");
 
        Hanoi(n, 'J', 'L', 'M');  // names of rods 
        
    }  
}


