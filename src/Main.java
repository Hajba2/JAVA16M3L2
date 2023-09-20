import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Month m = Month.APRIL;
        Month m1 = Month.FEBRUARY;
        Month m2 = Month.APRIL;

        switch (m) {
            case FEBRUARY: {
                System.out.println("FEBRUARY");
            }
            break;
            case APRIL: {
                System.out.println("APRIL");
            }
            break;
        }
    }

    public static void m2() {

        Scanner s = new Scanner(System.in);
        String i = s.nextLine();

        final int f = 9;
//        System.out.println(f);
//        f = 34567;
//        System.out.println(f);
//        f = 6267;
//        System.out.println(f);

        final String hello = "hello";

        switch (i) {
            case "1": {
                System.out.println("+");
            }
            break;
            case "2": {
                System.out.println("-");
            }
            break;
            case "3": {
                System.out.println("*");
            }
            break;
            case "4": {
                System.out.println("/");
            }
            break;
            case hello: {
                System.out.println("hello world app");
            }
            break;
            default:{
                System.out.println("you had enter incorrect number");
            }
        }

    }

    public static void m1() {
        System.out.println("getHuman() = " + getHuman());
        String s = "a";

        String color = s.equals("r") ? "red color" : "not red color";

        getAge(s.equals("r") ? 1 : 2);
    }

    public static Human getHuman() {

        String name = getName();
        int age = getAge();

        Human h = new Human();
        h.name = name;
        h.age = age;

        System.out.println("You had created human : " + h);
        System.out.println("Validation");

        if (h.age >=0 && h.age <=150) {
            return h;
        }

        return null;
    }

    public static String getName() {
        Scanner s = new Scanner(System.in);
        System.out.println("please enter name");
        String str = s.nextLine();

//        if (!str.isBlank()) {
//            return str.trim();
//        } else {
//            return "defaultName";
//        }

        return !str.isBlank() ? str.trim() : "defaultName";
    }

    public static int getAge() {
        Scanner s = new Scanner(System.in);
        System.out.println("please enter age");
        return s.nextInt();
    }

    public static int getAge(int a) {
        Scanner s = new Scanner(System.in);
        System.out.println("please enter age");
        return s.nextInt();
    }

}