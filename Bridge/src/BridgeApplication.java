import character.Riven;
import character.Thresh;
import color.HardGreenAndLightGreen;
import color.RedAndBlack;

public class BridgeApplication {

    public static void main(String[] args) {
        var greenThresh = new Thresh(new HardGreenAndLightGreen());
        var redThresh = new Thresh(new RedAndBlack());
        var greenRiven = new Riven(new HardGreenAndLightGreen());
        var redRiven = new Riven(new RedAndBlack());

        System.out.println("Green Thresh -> " + greenThresh.getColor().printColors());
        System.out.println("Red Thresh -> " + redThresh.getColor().printColors());
        System.out.println("Green Riven -> " + greenRiven.getColor().printColors());
        System.out.println("Red Riven -> " + redRiven.getColor().printColors());
    }

}
