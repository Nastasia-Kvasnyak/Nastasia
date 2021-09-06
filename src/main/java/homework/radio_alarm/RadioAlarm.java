package homework.radio_alarm;

import lombok.Setter;

@Setter
public class RadioAlarm {

   private Radio radio = new RadioImpl();
    private Alarm alarm = new AlarmImpl();

    public void a(){
        radio.a();
    }
    public void b(){
        radio.b();
    }
    public void c(){
        alarm.c();
    }
    public void d(){
        alarm.d();
    }

    public static void main(String[] args) {
        RadioAlarm radioAlarm = new RadioAlarm();
        radioAlarm.a();
        radioAlarm.b();
        radioAlarm.c();
        radioAlarm.d();
        radioAlarm.setRadio(new RadioImpl2());
        radioAlarm.a();
        radioAlarm.b();
    }

}
