package com.epita.socra.app;

import com.epita.socra.app.tools.*;

/**
 * Hello world!
 */
public final class App {
    private IOAdapter adapter;

    private App() {
        this(new ConsoleAdapter());
    }

    public App(IOAdapter adapter) {
        this.adapter = adapter;
    }

    /**
     * Says hello to the world.
     * 
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        App application = new App();
        RomanConverter romanConverter = new RomanConverter();
        Adder adder = new Adder();
        application.run(adder);
    }


    public void run(StringConverter arab2Roman){
        do {
            adapter.write("> ");
            String number = adapter.read();
            String roman = arab2Roman.convert(number);
            adapter.write(roman);
        } while(true);
    }
}
