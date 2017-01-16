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

    public static int scanInt() {
        String str = scanner.nextLine();
        return (str.matches("[\\d]+")) ? Integer.parseInt(str) : Util.scanInt(1);

    }
    public static int scanInt(int i) {
        System.out.println("Wrong input, repeat: ");
        String str = scanner.nextLine();
        return (str.matches("[\\d]+")) ? Integer.parseInt(str) : Util.scanInt(1);

    }

    public static int scanNumber() {
        String str = scanner.nextLine();
        return (str.matches("[\\d]")) ? Integer.parseInt(str) : Util.scanNumber(1);
    }

    public static int scanNumber(int i) {
        System.out.println("Wrong input, repeat: ");
        String str = scanner.nextLine();
        return (str.matches("[\\d]")) ? Integer.parseInt(str) : Util.scanNumber(1);
    }

    public static String choosePlane(){
        String str = scanner.nextLine();
        return (str.matches("[\\D]")) ? str.toUpperCase() : Util.choosePlane(1);
    }

    public static String choosePlane(int i){
        System.out.println("Wrong input, repeat: ");
        String str = scanner.nextLine();
        return (str.matches("[\\D]")) ? str.toUpperCase() : Util.choosePlane(1);
    }

}