package org.example;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


// Press ⇧ twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

//@Slf4j
public class Main {
    private final static Logger log =LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        // Press ⌥⏎ with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.

        System.out.printf("Hello and welcome!");
        System.out.printf("Hello and welcome!");



        // Press ⌃R or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {
            try{
                Thread.sleep(2000);
            } catch(InterruptedException e){
                e.printStackTrace();
            }

            log.info("info");

            // Press ⌃D to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing ⌘F8.
//            System.out.println("i = " + i);
        }
    }
}