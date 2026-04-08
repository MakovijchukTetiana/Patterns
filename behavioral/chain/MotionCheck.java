package behavioral.chain;

public class MotionCheck extends SecurityCheck {
    public void check(String condition) {
        if (condition.equals("Motion")) System.out.println("Охорона: Рух виявлено! Вмикаю камери.");
        else if (next != null) next.check(condition);
    }
}