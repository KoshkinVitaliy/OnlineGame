package classes;

import account.Hero;

import java.util.ArrayList;

public interface Skills {

    void addSkills(ArrayList<String> skills);

    void useFirstSkill(Hero hero);
    void useSecondSkill(Hero hero);
    void useThirdSkill(Hero hero);
}
