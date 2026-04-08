package behavioral.chain;

public class SoundCheck extends SecurityCheck {
    public void check(String condition) {
        if (condition.equals("Sound")) System.out.println("Охорона: Гучний звук! Надсилаю запис власнику.");
        else if (next != null) next.check(condition);
    }
}