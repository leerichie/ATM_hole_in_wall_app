package sec_project;

import java.util.Scanner;

public class MusicCollection {
    public int menuChoices (){

        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
        System.out.println("1. Position number:");
        System.out.println("2. Artist name:");
        System.out.println("3. Track name:");
        return menuChoices();
    }
    public void menu (){
        Scanner input = new Scanner(System.in);
        input.nextInt(menuChoices());
        System.out.println("- Welcome to 'Le Music' -");
        System.out.println("Choose an option:");
        System.out.println("1. Add a song");
        System.out.println("2. Remove a song");
        System.out.println("3. Find a song");
        System.out.println("4. Show all songs");
        System.out.println("5. Exit");
    }
    public static void main(String[] args) {
        MusicCollection musicCollection = new MusicCollection();
        musicCollection.menu();

    }
}
