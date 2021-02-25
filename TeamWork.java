package Recursion;
 
import java.util.Scanner;
public class TeamWork {
    // n = number of disk to be move rodOne where the disk is present rodThree where the disk to be move rodTwo is the remaining one 

    static void Hanoi(int n, char rodOne, char rodThree, char rodTwo) 
    { 
        if (n == 1)// check if n = 1 to be move then return 
        { 
            System.out.println("Disc 1 from " +  rodOne + " to " + rodThree); 
            return; 
        } 
        Hanoi(n-1, rodOne, rodTwo, rodThree); 
        
 
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

