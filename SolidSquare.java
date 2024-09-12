package Pattern;

import java.util.Scanner;

public class SolidSquare {
    public static void main(String[] args) {
        System.out.println("Enter the number of lines: ");
        Scanner sc = new Scanner(System.in);
        int noOfLine = sc.nextInt();
        for(int line=1;line<=noOfLine;line++){
            for(int star=1;star<=noOfLine;star++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
    
}
