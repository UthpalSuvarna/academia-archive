import java.util.Scanner;

public class electricityBill {
    int Cno;
    String Cname;
    double pmr, cmr;
    char Tc;
    double units, tbill;

    void getData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter consumer number");
        Cno = sc.nextInt();
        System.out.println("Enter the consumer name");
        sc.nextLine();
        Cname = sc.nextLine();
        System.out.println("Enter the previous meter reading");
        pmr = sc.nextInt();
        System.out.println("Enter the current meter reading");
        cmr = sc.nextInt();
        System.out.println("Enter the type of consumption");
        Tc = sc.next().charAt(0);
    }

    void calculate() {
        units = cmr - pmr;
        if (Tc == 'd') {
            if (units < 100)
                tbill = units * 1;
            else if (units > 100 && units <= 200)
                tbill = (100 * 1) + ((units - 100) * 2.5);
            else if (units > 200 && units <= 500)
                tbill = (100 * 1) + (100 * 2.5) + ((units - 200) * 4);
            else
                tbill = (100 * 1) + (100 * 2.5) + (300 * 4) + ((units - 500) * 6);
        } else if (Tc == 'c') {
            if (units < 100)
                tbill = units * 2;
            else if (units > 100 && units <= 200)
                tbill = (100 * 2) + ((units - 100) * 4.5);
            else if (units > 200 && units <= 500)
                tbill = (100 * 2) + (100 * 4.5) + ((units - 200) * 6);
            else
                tbill = (100 * 2) + (100 * 4.5) + (300 * 6) + ((units - 500) * 7);
        } else {
            System.out.println("Invalid type of user");
        }
    }

    void display() {
        System.out.println("Customer number " + Cno);
        System.out.println("Customer name " + Cname);
        System.out.println("Previous meter reading " + pmr);
        System.out.println("Current meter reading " + cmr);
        System.out.println("Type of consumer " + Tc);
        System.out.println("Total units " + units);
        System.out.println("Total tbill " + tbill);
    }

    public static void main(String args[]) {
        electricityBill E = new electricityBill();
        E.getData();
        E.calculate();
        E.display();
    }
}