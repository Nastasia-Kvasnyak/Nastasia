package homework.radioAlarm;

public class RadioAlarm extends Radio {

    public void c(){
        System.out.println("I am method c from Alarm");
    }
    public void d(){
        System.out.println("I am method d from Alarm");
    }

    public static void main(String[] args) {
        RadioAlarm rad = new RadioAlarm();
        rad.c();
        rad.d();
        rad.a();
        rad.b();
    }
}
