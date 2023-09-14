package account;

import java.util.ArrayList;

public class Hero {
    private String nickname;
    private String className;

    public ArrayList<String> getSkills() {
        return skills;
    }

    private ArrayList<String> skills;

    public String getNickname() {
        return nickname;
    }

    public String getClassName() {
        return className;
    }

    public Hero(String nickname, String className) {
        this.nickname = nickname;
        this.className = className;
    }


}
