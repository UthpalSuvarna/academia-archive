import java.util.*;

public class stringMethods {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("ente the string 1\n");

        String str1 = sc.nextLine();

        System.out.println("ente the string 2\n");

        String str2 = sc.nextLine();

        boolean a = str1.equals(str2);

        boolean b = str1.equalsIgnoreCase(str2);

        boolean c = str1.startsWith("H");

        boolean d = str1.startsWith("L", 3);

        boolean e = str1.endsWith("c");

        int f = str1.compareTo(str2);

        while (true) {

            System.out.println("\n1.Equals() 2.equalIgnoreCase() 3.startsWith() 4.endsWith() 5.compareTo 6.Exit\n");

            System.out.println("Enter your choice\n");

            int ch = sc.nextInt();

            switch (ch) {

                case 1:
                    if (a) {

                        System.out.println("Strings are equal\n");

                    } else {

                        System.out.println("Strings are not equal\n");

                    }

                    break;

                case 2:
                    if (b) {

                        System.out.println("Strings are identical\n");

                    } else {

                        System.out.println("Strings are not identical\n");

                    }

                    break;

                case 3:
                    if (c | d) {

                        System.out.println("Strings starts with H and has L in 3\n");

                    } else {

                        System.out.println("Strings don't start with H and has L in 3\n");

                    }

                    break;

                case 4:
                    if (e) {

                        System.out.println("String ends with c\n");

                    } else {

                        System.out.println("Strings don't end with c\n");

                    }

                    break;

                case 5:
                    if (f == 0) {

                        System.out.println("Strings are equal");

                    }

                    break;

                case 6:
                    System.exit(0);

                default:
                    System.out.println("Enter valid option valid\n");

                    break;

            }

        }

    }

}
