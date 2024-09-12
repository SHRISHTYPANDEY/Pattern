package Pattern;

import java.util.Scanner;

public class InvertedPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = sc.nextInt();
        int totalspace=rows-1;
        for(int spaces=0;spaces<=totalspace;spaces++){
            for(int star=rows;star>=1;star++){
                System.out.print("* ");
            }
        }
    }
    
}
