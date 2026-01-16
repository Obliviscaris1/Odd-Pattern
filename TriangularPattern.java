import java.util.Scanner;

public class TriangularPattern {
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Numbers of Row : ");
        int user = input.nextInt();

         for(int i = 1; i <= user; i++ ){
            
                    for(int j = 1; j <= user - (i); j++  ){  // Printing Space
                        System.out.print(" ");
                    }

                    for(int k = 1; k <= 2 * i - 1  ; k++){  // Printing Star
                        System.out.print("*");     
                    }     
            System.out.println();
        }
   }
}
