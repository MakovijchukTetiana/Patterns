package behavioral.chain;

public abstract class SecurityCheck {
    protected SecurityCheck next;
    public void setNext(SecurityCheck next) { this.next = next; }
    public abstract void check(String condition);
}