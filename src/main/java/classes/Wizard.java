package classes;

import account.Hero;

import java.util.ArrayList;

public class Wizard implements Skills{

    @Override
    public void addSkills(ArrayList<String> skills) {
        skills.add("Fireball");
        skills.add("Snowball");
        skills.add("Lightning");
    }

    @Override
    public void useFirstSkill(Hero hero) {
        System.out.println(hero.getNickname() + " used skill " + hero.getSkills().get(0));
    }

    @Override
    public void useSecondSkill(Hero hero) {
        System.out.println(hero.getNickname() + " used skill " + hero.getSkills().get(1));
    }

    @Override
    public void useThirdSkill(Hero hero) {
        System.out.println(hero.getNickname() + " used skill " + hero.getSkills().get(2));
    }
}
