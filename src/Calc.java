import java.util.Scanner;

public class Calc {

    public static void main(String[] args) {
        System.out.println("Calculator started");
        printMenu();

        Scanner s = new Scanner(System.in);
        int action = getInt(s, "action");

        int a = getInt(s, "number a");
        int b = getInt(s, "number b");

        double result = processAction(action, a, b);

        if (action >= 1 && action <= 4) {
            System.out.println("result = " + result);
        }

        s.close();
    }

    public static double processAction(int action, int a, int b) {
        double result = 0;
        switch (action) {
            case 1 : {
                result = a + b;
            }
            break;
            case 2 : {
                result = a - b;
            }
            break;
            case 3 : {
                result = a * b;
            }
            break;
            case 4 : {
                if (b != 0) {
                    result = a / b;
                } else {
                    System.out.println("You had try to divide by 0");
                }
            }
            break;
            default: {
                System.out.println("You had select incorrect action");
            }
        }
        return result;
    }

    public static void printMenu() {
        System.out.println("Please select action to do:");
        System.out.println("1 -> add");
        System.out.println("2 -> minus");
        System.out.println("3 -> multiply");
        System.out.println("4 -> divide");
    }

    public static int getInt(Scanner s, String additionalStr) {
        System.out.println("please enter " + additionalStr);
//        int i = s.nextInt();
//        return i;
        return s.nextInt();
    }

}
