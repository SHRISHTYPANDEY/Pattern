package Pattern;

import java.util.Scanner;

public class RightPyramid {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = sc.nextInt();
        int totalSpace= rows-1;
        for(int line=1;line<=rows;line++){
            for(int space=1;space<=totalSpace;space++){
                System.out.print(" ");
            }
            for(int star=1;star<=line;star++){
                System.out.print("*");
            }
            totalSpace--;
            System.out.println();
        }
    }
    
}
