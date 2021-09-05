package homework.radio_alarm;

public class RadioAlarm implements Radio,Alarm {
    @Override
    public void c() {
        System.out.println("I am method c from world "+Alarm.class.getSimpleName());
    }

    @Override
    public void d() {
        System.out.println("I am method d from world "+Alarm.class.getSimpleName());
    }

    @Override
    public void a() {
        System.out.println("I am method a from world "+Radio.class.getSimpleName());
    }

    @Override
    public void b() {
        System.out.println("I am method b from world "+Radio.class.getSimpleName());
    }
    // a radio
    // b radio
    // c alarm
    // d alarm
    public static void main(String[] args) {
        RadioAlarm radioAlarm = new RadioAlarm();
        radioAlarm.a();
        radioAlarm.b();
        radioAlarm.c();
        radioAlarm.d();
    }
}
