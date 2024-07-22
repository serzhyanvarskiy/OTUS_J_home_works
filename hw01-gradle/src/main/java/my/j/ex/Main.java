// spotless:on
package my.j.ex;

import my.j.ex.hw01.HelloOtus;

// TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        HelloOtus HiOtto = new HelloOtus("Zharov", "Eduardovich", "Sergey");
        System.out.println("Hello, Otus! I'm your student. Info:" + HiOtto);

        System.out.println("Hello and welcome!");

        // TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon
        // src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
        // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
        for (int i = 1; i <= 5; i++) System.out.println("i = " + i);
    }
}
