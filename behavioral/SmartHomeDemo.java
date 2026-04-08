package behavioral;

// Імпортуємо всі наші підпакети
import behavioral.strategy.*;
import behavioral.observer.*;
import behavioral.command.*;
import behavioral.state.*;
import behavioral.chain.*;
import behavioral.mediator.*;
import behavioral.memento.*;
import behavioral.template.*;
import behavioral.iterator.*;
import behavioral.visitor.*;

public class SmartHomeDemo {
    public static void main(String[] args) {
        System.out.println("1. STRATEGY ");
        Thermostat thermostat = new Thermostat();
        thermostat.setStrategy(new EcoHeating());
        thermostat.applyHeating();

        System.out.println("\n 2. OBSERVER ");
        SmokeSensor sensor = new SmokeSensor();
        sensor.addObserver(new PhoneDisplay());
        sensor.detectSmoke();

        System.out.println("\n 3. COMMAND ");
        Light livingRoomLight = new Light();
        Command turnOn = new TurnOnLightCommand(livingRoomLight);
        turnOn.execute();

        System.out.println("\n 4. STATE ");
        SmartDoor door = new SmartDoor();
        door.setState(new LockedState());
        door.touch();

        System.out.println("\n 5. CHAIN OF RESPONSIBILITY ");
        SecurityCheck motion = new MotionCheck();
        SecurityCheck sound = new SoundCheck();
        motion.setNext(sound);
        motion.check("Sound");

        System.out.println("\n 6. MEDIATOR ");
        SmartHub hub = new SmartHub();
        HallDoor hallDoor = new HallDoor(hub);
        hallDoor.open();

        System.out.println("\n 7. MEMENTO ");
        ClimateControl climate = new ClimateControl();
        climate.setTemperature(22);
        ClimateMemento savedState = climate.save();
        climate.setTemperature(18);
        climate.restore(savedState);

        System.out.println("\n 8. TEMPLATE METHOD ");
        DailyRoutine routine = new WorkdayRoutine();
        routine.startRoutine();

        System.out.println("\n 9. ITERATOR ");
        DeviceList deviceList = new DeviceList();
        Iterator iterator = deviceList.getIterator();
        while(iterator.hasNext()) {
            System.out.println("Знайдено пристрій: " + iterator.next());
        }

        System.out.println("\n 10. VISITOR ");
        SmartSpeaker speaker = new SmartSpeaker();
        speaker.accept(new DiagnosticsVisitor());
    }
}