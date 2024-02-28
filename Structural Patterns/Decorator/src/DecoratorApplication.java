import character.Thresh;
import items.BlackCleaver;
import items.JakSho;
import items.Rabadon;

public class DecoratorApplication {

    public static void main(String[] args) {
        var thresh = new Thresh();
        var rabadon = new Rabadon(thresh);
        var blackCleaver = new BlackCleaver(rabadon);
        var jakSho = new JakSho(blackCleaver);
        var jakSho2 = new JakSho(jakSho);

        jakSho2.showStats();
    }

}
