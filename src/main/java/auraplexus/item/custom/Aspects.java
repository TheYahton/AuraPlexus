package auraplexus.item.custom;

import java.util.HashMap;

public class Aspects {
    public static HashMap<Integer, Integer> aspectColors = setAspectColors();

    public static HashMap<Integer, String> intAspectColor = setIntAspect();

    private static HashMap<Integer, String> setIntAspect() {
        HashMap<Integer, String> intAspect = new HashMap<>();

        intAspect.put(0, "aer");
        intAspect.put(1, "terra");
        intAspect.put(2, "ignis");
        intAspect.put(3, "aqua");
        intAspect.put(4, "ordo");
        intAspect.put(5, "perditio");

        return intAspect;
    }

    public static HashMap<Integer, Integer> setAspectColors() {
        HashMap<Integer, Integer> aspectColors = new HashMap<>();

        aspectColors.put(0, 0xffff7e);
        aspectColors.put(1, 0x56c000);
        aspectColors.put(2, 0xff5a01);
        aspectColors.put(3, 0x3cd4fc);
        aspectColors.put(4, 0xd5d4ec);
        aspectColors.put(5, 0x404040);

        return aspectColors;
    }

    public static int getAspectColor(Integer aspectName) {
        return aspectColors.getOrDefault(aspectName, 0xFFFFFF);
    }
}
