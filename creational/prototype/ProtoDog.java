package creational.prototype;

public class ProtoDog implements Prototype {
    String sound;

    public ProtoDog(String sound) {
        this.sound = sound;
    }

    @Override
    public Prototype doClone() {
        return new ProtoDog(sound);
    }

    public String toString() {
        return "This dog says " + sound;
    }
}