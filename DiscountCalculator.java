import java.util.Scanner;

public class StudentPassFail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

         System.out.print("Enter marks for Subject 1: ");
        int subject1 = scanner.nextInt();

        System.out.print("Enter marks for Subject 2: ");
        int subject2 = scanner.nextInt();

        System.out.print("Enter marks for Subject 3: ");

        int subject3 = scanner.nextInt();

        int failCount = 0;

        if (subject1 < 40) failCount++;
        if (subject2 < 40) failCount++;
        if (subject3 < 40) failCount++;

        switch (failCount) {
            case 0:
                System.out.println("Congratulations! You passed all subjects.");
                break;
            default:
                System.out.println("You failed in " + failCount + " subject(s).");

                switch (failCount) {
                    case 1:
                        System.out.println("You need to improve in one subject.");
                        break;
                    case 2:
                        System.out.println("You need to work harder, failed in two subjects.");
                        break;
                    case 3:
                        System.out.println("You failed all subjects. Consider retaking the exam.");
                        break;
                }
        }

        scanner.close();  
     }
}

                   
