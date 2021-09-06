package homework.radio_alarm;

public class AlarmImpl implements Alarm {
    @Override
    public void c() {
        System.out.println("I am method c from world "+Alarm.class.getSimpleName());
    }

    @Override
    public void d() {
        System.out.println("I am method d from world "+Alarm.class.getSimpleName());
    }
}
