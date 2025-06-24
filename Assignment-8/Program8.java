import java.util.*;

interface Instrument {
    void play();
}

interface StringInstrument extends Instrument {
    void tuneStrings();
}

class Guitar implements StringInstrument {
    public void play() {
        System.out.println("Playing guitar");
    }
    public void tuneStrings() {
        System.out.println("Tuning guitar strings");
    }
}

public class Assignment8 {
    public static void main(String[] args) {
        StringInstrument g = new Guitar();
        g.tuneStrings();
        g.play();
    }
}
