/*
**  BRAZILIAN PORTUGUESE:
**
**      Jogo de Adivinhação
**      Crie um programa que simula um jogo de adivinhação, que deve gerar um número aleatório entre 0 e 100
**      e pedir para que o usuário tente adivinhar o número, em até 5 tentativas.
**      A cada tentativa, o programa deve informar se o número digitado pelo usuário é maior ou menor do que o número gerado.
**
**  ENGLISH:
**
**      Guessing Game
**      Create a program that simulates a guessing game, which should generate a random number between 0 and 100
**      and ask the user to guess the number, until 5 attempts are made.
**      At each attempt, the program should inform whether the number entered by the user is greater or less than the
**      generated number.
*/

import java.util.Scanner;
import java.util.Random;

public class Main
{
    public static void main(String[] args)
    {
        int         randomNumber;
        int         userGuess;
        int         attempts;
        final int   MAX_ATTEMPTS;
        Scanner     keyboard;

        randomNumber = new Random().nextInt(100);
        userGuess = 0;
        attempts = 0;
        MAX_ATTEMPTS = 5;
        keyboard = new Scanner(System.in);
        System.out.println("\n========== GUESS the NUMBER game ===========");
        System.out.println("\nI have genarated a number between 0 and 100");
        System.out.printf("You have %d attempts to guess it\n", MAX_ATTEMPTS);
        while (attempts < MAX_ATTEMPTS)
        {
            attempts++;
            System.out.printf("\n------------- Attempt #%d -------------\n", attempts);
            System.out.print("Guess a number between 0 and 100: ");
            userGuess = keyboard.nextInt();
            if (userGuess < 0 || userGuess > 100)
            {
                System.out.println("Your guess is out of range!");
            }
            if (userGuess != randomNumber)
            {
                if (userGuess > randomNumber)
                {
                    System.out.println("Your guess is greater than the number");
                }
                else
                {
                    System.out.println("Your guess is less than the number");
                }
                if (attempts == MAX_ATTEMPTS)
                {
                    System.out.println("\nYou have reached the maximum number of attempts and couldn't guess the number  :(");
                    System.out.printf("The number was: %d\n", randomNumber);
                }
            }
            else if (userGuess == randomNumber )
            {
                System.out.println("Congratulations! You guessed it!");
                break ;
            }
        }
        keyboard.close();
        System.out.println("\n===========================================\n");
    }
}