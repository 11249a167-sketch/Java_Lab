import java.util.Scanner;

public class Student {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int regNo, rollNo;
        String name;

        String[] subject = new String[5];
        int[] credit = new int[5];
        int[] marks = new int[5];

        System.out.print("Enter Register Number: ");
        regNo = sc.nextInt();

        System.out.print("Enter Roll Number: ");
        rollNo = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Student Name: ");
        name = sc.nextLine();

        System.out.println("\nEnter Subject Details");

        for (int i = 0; i < 5; i++) {

            System.out.println("\nSubject " + (i + 1));

            System.out.print("Subject Name: ");
            subject[i] = sc.nextLine();

            System.out.print("Credit: ");
            credit[i] = sc.nextInt();

            System.out.print("Marks: ");
            marks[i] = sc.nextInt();
            sc.nextLine();
        }

        Result result = new Result();
        result.calculateResult(subject, credit, marks);

        Attendance attendance = new Attendance();

        System.out.print("\nEnter Total Working Hours: ");
        int totalHours = sc.nextInt();

        System.out.print("Enter Hours Attended: ");
        int attendedHours = sc.nextInt();

        System.out.print("Enter OD Hours: ");
        int odHours = sc.nextInt();

        attendance.calculateAttendance(totalHours, attendedHours, odHours);

        sc.close();
    }
}