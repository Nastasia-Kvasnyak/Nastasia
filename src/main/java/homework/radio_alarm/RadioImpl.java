package homework.radio_alarm;

public class RadioImpl implements Radio {
    @Override
    public void a() {
        System.out.println("I am method a from world "+Radio.class.getSimpleName());
    }

    @Override
    public void b() {
        System.out.println("I am method b from world "+Radio.class.getSimpleName());
    }
}
