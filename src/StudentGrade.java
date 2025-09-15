import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        //Scanner til indlæsning af danske karakter
        Scanner inputscanner = new Scanner(System.in);
        System.out.println("Welcome to the Student Grade Calculator! ");
        System.out.print("Enter the student's Danish score: ");
        int KarakterDk = inputscanner.nextInt();

        //Variable
        String KarakterUs = "";

        //Switch statement til at tildele String KarakterUs det rigtige Bogstav
        switch (KarakterDk){
            case 12:
                KarakterUs = "A";
                break;
            case 10:
                KarakterUs = "B";
                break;
            case 7:
                KarakterUs = "C";
                break;
            case 4:
                KarakterUs = "D";
                break;
            case 2:
                KarakterUs = "E";
                break;
            case 0, -3:
                KarakterUs = "F";
                break;
            default:
                KarakterUs = "\n\n!!!!FEJL!!!! - Ikke et acceptabel tal";
        }

        //Printer resultatet ud
        System.out.println("The student's grade in USA is: " + KarakterUs);
    }
}
