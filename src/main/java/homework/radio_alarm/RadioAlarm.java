package homework.radio_alarm;

public class RadioAlarm {

    public void a(){
        RadioImpl radio = new RadioImpl();
        radio.a();
    }
    public void b(){
        RadioImpl radio = new RadioImpl();
        radio.b();
    }
    public void c(){
        AlarmImpl alarm = new AlarmImpl();
        alarm.c();
    }
    public void d(){
        AlarmImpl alarm = new AlarmImpl();
        alarm.d();
    }

    public static void main(String[] args) {
        RadioAlarm radioAlarm = new RadioAlarm();
        radioAlarm.a();
        radioAlarm.b();
        radioAlarm.c();
        radioAlarm.d();
    }

}
