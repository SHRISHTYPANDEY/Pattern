package Pattern;

import java.util.Scanner;

public class InvertedRightPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = sc.nextInt();
        int totalSpace=0;
        for(int line=rows;line>=1;line--){
           for(int space=0;space<=totalSpace;space++){
            System.out.print(" ");
           }
           for(int star=1;star<=line;star++){
            System.out.print("*");
           }
           totalSpace++;
           System.out.println();
    }
    
}
}