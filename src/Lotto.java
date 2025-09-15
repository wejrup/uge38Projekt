/*
 ********** Lotto.java **********
 *
 ********** Beskrivelse **********
 *I dette projekt skal du udvikle et lille program, der simulerer et lottospil.
 * Programmet skal tilfældigt generere et tocifret tal (fra 00 til 99),
 * hvorefter brugeren bliver bedt om at indtaste sit eget tocifrede tal som gæt.
 * Programmet afgør derefter, om brugeren har vundet en præmie, baseret på nogle regler
 */

import java.util.Scanner;

public class Lotto {
    public static void main(String[] args) {

        //Indlæser af user input
        Scanner Input = new Scanner(System.in);
        System.out.print("\n\nIndtast 2 cifret tal som gæt [00-99]: ");
        int UserInput = Input.nextInt();

        //Random Number generator
        int RandomNum = (int)(Math.random() * 100); // 0 til 99
        System.out.printf("\nLottotal: %02d\n\n", RandomNum);

        //UserInput og RandomNum deles op i tal 1 og tal 2 som ingår i tallet
        int UserInput1 = UserInput / 10;
        int UserInput2 = UserInput % 10;
        int RandomNum1 = RandomNum / 10;
        int RandomNum2 = RandomNum % 10;


        //If Else statements til gevinst styring
        if (UserInput == RandomNum){
            System.out.println("Tillykke du har vundet 10.000 DKK\n");
        }
        else if ((UserInput1 == RandomNum1 || UserInput1 == RandomNum2) && (UserInput2 == RandomNum1 || UserInput2 == RandomNum2)) {
            System.out.println("Tillykke du har vundet 3.000 DKK\n");
        }
        else if ((UserInput1 == RandomNum1 || UserInput1 == RandomNum2) || (UserInput2 == RandomNum1 || UserInput2 == RandomNum2)) {
            System.out.println("Tillykke du har vundet 1.000 DKK\n");
        }
        else {
            System.out.println("Der var desværre ingen gevinst\n");
        }
    }
}
