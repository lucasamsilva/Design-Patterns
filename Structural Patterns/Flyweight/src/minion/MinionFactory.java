package minion;

import java.util.HashMap;
import java.util.Map;

import static java.util.Objects.nonNull;

public class MinionFactory {

    private static Map<String, MinionModel> minionModels = new HashMap<>();

    public static MinionModel getMinionModel(String color) {
        var minionModel = minionModels.get(color);
        if(nonNull(minionModel)) {
            return minionModel;
        }
        minionModel = new MinionModel(color);
        minionModels.put(color, minionModel);
        return minionModel;
    }

}
