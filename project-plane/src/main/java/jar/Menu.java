package jar;

public class Menu {

    public static void menu() {

        boolean a = true;
        while (a) {
            System.out.println("Choose type of plane: 1-army, 2-airfreighter, 3-passenger");
            int key = Util.scanNumber();
            switch (key) {
                case 1:
                    army();
                    a = exit();
                    break;
                case 2:

                    a = exit();
                    break;
                case 3:

                    a = exit();
                    break;
                default:
                    System.out.println("Wrong input!, repeat: ");
            }
        }
    }

    public static boolean exit() {
        System.out.println("Continue? n-exit, any other-continue");
        String exit = Util.scanner.nextLine();
        return (exit.charAt(0) != 'n');
    }

    public static void army() {
        System.out.println("Choose plane:" +
                "\nL - La-5, tank capacity-500 l, fuel consumption-2 l/km" +
                "\nM - MiG-3, tank capacity-450 l, fuel consumption-3 l/km" +
                "\nY - YF-23, tank capacity-300 l, fuel consumption-1 l/km" +
                "\nS - SY-9, tank capacity-800 l, fuel consumption-4 l/km" +
                "\nP - PE-3, tank capacity-600 l, fuel consumption-3 l/km");
        String choose = Util.choosePlane();
        System.out.println("choose type of target: 1-9; 1-the easiest, 9-the hardest");
        int target = Util.scanNumber();
        System.out.println("Enter distance to fly");
        int distance = Util.scanInt();
        switch (choose) {
            case "L":
                Army LA = new Army("LA-5", 500, 2, target, distance);
                break;
            case "M":
                Army MI = new Army("MiG-3", 450, 3, target, distance);
                break;
            case "Y":
                Army YF = new Army("YF-23", 300, 1, target, distance);
                break;
            case "S":
                Army SY = new Army("SY-9", 800, 4, target, distance);
                break;
            case "P":
                Army PE = new Army("PE-3", 600, 3, target, distance);
                break;
            default:
                System.out.println("Wrong input");
        }
    }
}
