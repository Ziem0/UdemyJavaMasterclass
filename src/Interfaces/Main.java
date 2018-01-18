package Interfaces;

public class Main {

    public static void main(String[] args) {
        ITelephone ziemoPhone;
        ziemoPhone = new DeskPhone(123456);
        ziemoPhone.powerOn();
        ziemoPhone.dial(123456);
        ziemoPhone.answer();
    }
}
