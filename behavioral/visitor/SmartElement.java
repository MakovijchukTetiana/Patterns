package behavioral.visitor;

public interface SmartElement {
    void accept(Visitor visitor);
}