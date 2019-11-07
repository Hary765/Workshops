import java.util.Scanner;

public class VowelCounter
{
    public static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);

        String word= s.nextLine();
        //Count of letters
        int countA=0;
        int countE=0;
        int countI=0;
        int countO=0;
        int countU=0;

        //Position of letters
        char checkA;
        char checkE;
        char checkI;
        char checkO;
        char checkU;



        //Ints not related to the vowels
        int TotL;
        int startL;
        //pos for char
        int posA = 0;
        int posE = 0;
        int posI = 0;
        int posO = 0;
        int posU = 0;

        System.out.print("Please enter a word or phrase: ");
        word=s.nextLine();

        TotL=word.length();

        for(startL = 1; startL<=TotL; startL++)
        {
            //finding vowels a
            checkA = word.charAt(posA);
            if(checkA == 'a')
                countA++;
            posA++;

            //finding vowels e
            checkE = word.charAt(posE);
            if(checkE == 'e')
                countE++;
            posE++;

            //finding vowels i
            checkA = word.charAt(posI);
            if(checkA == 'i')
                countI++;
            posI++;

            //finding vowels o
            checkE = word.charAt(posO);
            if(checkE == 'o')
                countO++;
            posO++;

            //finding vowels u
            checkE = word.charAt(posU);
            if(checkE == 'u')
                countU++;
            posU++;

        }

        System.out.println("Your word or phrase was " + word);
        System.out.println("You have " + countA + " a's, " + countE + " e's, " + countI + " i's, " + countO + " o's, and " + countU + " u's.");

    }
}