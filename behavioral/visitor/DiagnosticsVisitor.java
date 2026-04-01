package behavioral.visitor;

public class DiagnosticsVisitor implements Visitor {
    public void visit(SmartSpeaker speaker) { System.out.println("Діагностика: " + speaker.getStatus()); }
}