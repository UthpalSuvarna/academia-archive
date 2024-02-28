import java.util.Scanner;

class employee {
    String empName;
    int empId;
    String Address;
    String mailId;
    int mobileNo;
    int BP;
    double DA, HRA, PF, SF, GP, NP;

    void getData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name");
        empName = sc.nextLine();
        System.out.println("Enter Employee ID");
        empId = sc.nextInt();
        System.out.println("Enter mail id");
        sc.nextLine();
        mailId = sc.nextLine();
        System.out.println("Enter mobile nuber");
        mobileNo = sc.nextInt();
        System.out.println("Enter Basic Pay");
        BP = sc.nextInt();
    }

    void display() {
        System.out.println("*******Employee Details*******");
        System.out.println("Employee name: " + empName);
        System.out.println("Employee Id: " + empId);
        System.out.println("Employee Address " + Address);
        System.out.println("Mail ID: " + mailId);
        System.out.println("Mobile Number: " + mobileNo);
    }
}

class Professor extends employee {
    void calculate() {
        DA = 0.97 * BP;
        HRA = 0.1 * BP;
        PF = 0.12 * BP;
        SF = 0.01 * BP;
        GP = BP + DA + HRA;
        NP = GP - PF - SF;
        System.out.println("DA=" + DA);
        System.out.println("HRA=" + HRA);
        System.out.println("PF=" + PF);
        System.out.println("SF=" + SF);
        System.out.println("GP=" + GP);
        System.out.println("NP=" + NP);
    }
}

class asstProfessor extends employee {
    void calculate() {
        DA = 0.7 * BP;
        HRA = 0.1 * BP;
        PF = 0.12 * BP;
        SF = 0.01 * BP;
        GP = BP + DA + HRA;
        NP = GP - PF - SF;
        System.out.println("DA=" + DA);
        System.out.println("HRA=" + HRA);
        System.out.println("PF=" + PF);
        System.out.println("SF=" + SF);
        System.out.println("GP=" + GP);
        System.out.println("NP=" + NP);
    }
}

class asscProfessor extends employee {
    void calculate() {
        DA = 0.6 * BP;
        HRA = 0.1 * BP;
        PF = 0.12 * BP;
        SF = 0.01 * BP;
        GP = BP + DA + HRA;
        NP = GP - PF - SF;
        System.out.println("DA=" + DA);
        System.out.println("HRA=" + HRA);
        System.out.println("PF=" + PF);
        System.out.println("SF=" + SF);
        System.out.println("GP=" + GP);
        System.out.println("NP=" + NP);
    }
}

public class paySlip {
    public static void main(String args[]) {
        System.out.println("\n1.Professor\n 2.Assistant Professor\n 3.Associate Professor\n");
        Scanner input = new Scanner(System.in);
        System.out.println("Select option");
        int ch = input.nextInt();
        switch (ch) {
            case 1:
                Professor p1 = new Professor();
                p1.getData();
                p1.display();
                p1.calculate();
                break;
            case 2:
                asstProfessor p2 = new asstProfessor();
                p2.getData();
                p2.display();
                p2.calculate();
                break;
            case 3:
                asstProfessor p3 = new asstProfessor();
                p3.getData();
                p3.display();
                p3.calculate();
                break;
            default:
                System.out.println("Invalid option");

        }
    }
}
