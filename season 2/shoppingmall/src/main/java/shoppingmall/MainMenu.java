package shoppingmall;

import viewers.MainMenuViewer;

import java.util.Scanner;

public class MainMenu {
    public void showMain(){
        new MainMenuViewer();
        Scanner scanner = new Scanner(System.in);
        scanner.nextInt();
    }

    public MainMenu() {

    }
}
