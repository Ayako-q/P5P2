package com.example.p5p2;
import java.util.Scanner;
/**
 *Pseudocode
 *1.Run recommendor block
 *2.Get users name and age
 *3.Check users age and recommend him a book
 *4.Ask user if he wants to try again (if yes - go back to the 1.)
 */
public class P5P2 {
    public static void main (String[] args){
        while(InGame()){
            Scanner in = new Scanner(System.in);
            System.out.println("Hi, user, I am book recommendor, tell me your name:");
            recomendor(); //run recomendor block
            }
        }
    public static String GetUserString () {
        Scanner in = new Scanner(System.in);
        String x = in.nextLine();
        return x;}
    //ask user if he wants to play agai (if yes - return to 1.)
    public static boolean InGame () {
        System.out.println("Do you want to start again? Type Y/N :");
        String wannaplay = GetUserString();
        if (wannaplay.toLowerCase().equals("y")) {
            System.out.println("Okay, lets do it one more time");
            return true;
        }
        else if (wannaplay.toLowerCase().equals("n")){
            System.out.println("Okay, thank you for your time, bye!");
            return false;
        }
        System.out.println("That is something different from Y/N" +
                ", please run the program again again!");
        return false;}

    public static int GetInt(){
        Scanner in = new Scanner(System.in);
        int y = in.nextInt();
        return y;}

    public static boolean recomendor() {
        String username = GetUserString();
        System.out.println("Nice to meet you, " + username + ", what is your age:");
        int userage = GetInt();
        System.out.println("Now, choose book genre that you like, type 1 (science fiction) or 2 (Detective)");
        int genre = GetInt();
        if (userage <= 6) {
            System.out.println("Sorry, " + username + ", we can't recommend book for you at this moment.");
        } else if (userage >= 13 && userage <= 17) {
            if (genre == 1) {
                System.out.println("We recommend you to read Dune by Frank Herbert");
            } else if (genre == 2) {
                System.out.println("We recommend you to read Sherlock Holmes by Arthur Conan Doyle");
            }
        } else if (userage >= 18) {
            if (genre == 1) {
                System.out.println("We recommend you to read by 1984 by George Orwell");
            } else if (genre == 2) {
                System.out.println("We recommend you to read The Girl with the Dragon Tattoo");
            }
        }
    return false;}
}

