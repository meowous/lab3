import javax.swing.*;
import java.net.SocketOption;
import java.net.SocketTimeoutException;

public class Main {
    public static void main(String[] args) {
        Human Each = new Human("Каждый");
        Human Skuperdiay = new Human("Господин Скуперфильд");
        Human Millionaire = new Human("Миллионер");
        Author Lol = new Author("Автор");

        Objects Ferting = new Objects("Фертинг");
        Objects Capital = new Objects("Капитал");
        Objects bigCapital = new Objects("колосальное состояние");

        System.out.print(Each.saw(Skuperdiay));
        System.out.println(Each.dontBelieved(Millionaire) + Lol.speak(", настолько он весь был худой и, если так можно выразиться, узловатый."));
        Skuperdiay.setFeel(Feelings.GREED);
        System.out.println(Lol.speak("Нужно, однако ж, сказать, что ") + Skuperdiay.lostWeight());
        System.out.print(Skuperdiay.spend(Ferting));
        System.out.print(Skuperdiay.toBeNervous());
        System.out.println(Skuperdiay.torment() + Skuperdiay.loseWeight());
        System.out.println(Skuperdiay.compensate() + Skuperdiay.ate() + Skuperdiay.gainWeight() + "\n" + Lol.speak("так как ему не давала покоя мысль, что ") +
                Skuperdiay.getName() + Skuperdiay.hasSpent());
        System.out.println(Skuperdiay.knew() + Lol.speak(", что его жадность вредит его же здоровью, но со своей собачьей натурой (так он говорил сам)") + Skuperdiay.cantDoSomething());
        System.out.print(Skuperdiay.thinking(bigCapital));

    }
}
