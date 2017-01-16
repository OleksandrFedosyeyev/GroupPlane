package jar;

import java.security.SecureRandom;
import java.util.Scanner;

class Util {

    static Scanner scanner = new Scanner(System.in);

    private Util() {
    }

    static int generateRandom(int min, int max) {
        SecureRandom secureRandom = new SecureRandom();
        return secureRandom.nextInt((max + 1) - min) + min;
    }

    static int scanner() {
        while (!scanner.hasNextInt()) {
            System.out.println("Please, enter valid integer number: ");
            scanner.nextLine();
        }
        return scanner.nextInt();
    }

}