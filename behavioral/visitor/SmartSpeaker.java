package behavioral.visitor;

public class SmartSpeaker implements SmartElement {
    public void accept(Visitor visitor) { visitor.visit(this); }
    public String getStatus() { return "Колонка працює нормально."; }
}