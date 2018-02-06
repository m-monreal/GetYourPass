// Pass generator
// Get your pass
// By cef

import java.util.Scanner;

public class GetYourPass {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        
        String mayus = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String minus = "abcdefghijklmnopqrstuvwxyz";
        String numes = "0123456789";
        String espec = "Ññ-_!$%&/?<>+*;:";
        
        String characters = mayus + minus + numes + espec;
        String password = "";
        
        System.out.print("What password size do you prefer: ");
        int sizePassword = input.nextInt();
        
        for (int i = 0; i < sizePassword; i++) {
            password += (characters.charAt((int)(Math.random() * characters.length())));
        }
        
        System.out.println("Your password is :" + password);
    }

}
