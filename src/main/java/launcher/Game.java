package launcher;

import account.Account;
import account.Hero;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {

    private ArrayList<Account> accounts = new ArrayList<>();


    private void addAccount(Account account) {
        accounts.add(account);
    }

    private void loadAccounts() {
        Account account = new Account("Lucky", "1234");
        Hero hero = new Hero("TrueWizard", "Wizard");

        account.addHero(hero);
        addAccount(account);
    }

    public void startGame() {
        loadAccounts();

        if (useScanner("Введите логин: ").equals(accounts.get(0).getLogin())) {
            checkPassword();
        }
        else {
            System.out.println("Неверный логин. Попробуйте ещё раз.");
            startGame();
        }
    }

    private void checkPassword() {
        if (useScanner("Введите пароль: ").equals(accounts.get(0).getPassword())){
            chooseHero();
        }
        else {
            System.out.println("Неверный пароль. Попробуйте ещё раз.");
            checkPassword();
        }
    }

    private void chooseHero() {
        System.out.println(accounts.get(0).getHeroes().get(0).getNickname());
        useScanner("Выберите персонажа, введя его ник: ");
    }

    private String useScanner(String message) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(message);

        return scanner.nextLine();
    }
}
