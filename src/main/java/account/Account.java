package account;

import java.util.ArrayList;

public class Account {
    private String login;

    private String password;

    public Account(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public ArrayList<Hero> getHeroes() {
        return heroes;
    }

    private ArrayList<Hero> heroes = new ArrayList<>();

    public void addHero(Hero hero) {
        if (heroes.size() < 3) {
            heroes.add(hero);
        }
        else System.out.println("No slots available for a new character.");

    }
}
