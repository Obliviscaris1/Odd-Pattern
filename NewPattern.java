import java.util.Scanner;

public class NewPattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number of Rows : ");
        int user = input.nextInt();

        for(int i = 1; i<= user; i++){

            System.out.println(" * * ");
            System.out.println("* * *");
        }
    }    
}
