package Pattern;

import java.util.Scanner;

public class InvertedLeftPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = sc.nextInt();
        for(int line=1;line<=rows;line++){
            for(int star=5;star>=line;star--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
