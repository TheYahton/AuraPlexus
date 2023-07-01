package auraplexus.item.custom;

import java.util.HashMap;

public class Aspects {
    public static HashMap<String, Integer> aspectColors = setAspectColors();

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

    public static HashMap<String, Integer> setAspectColors() {
        HashMap<String, Integer> aspectColors = new HashMap<>();

        aspectColors.put("aer", 0xffff7e);
        aspectColors.put("terra", 0x56c000);
        aspectColors.put("ignis", 0xff5a01);
        aspectColors.put("aqua", 0x3cd4fc);
        aspectColors.put("ordo", 0xd5d4ec);
        aspectColors.put("perditio", 0x404040);

        return aspectColors;
    }

    public static int getAspectColor(String aspectName) {
        return aspectColors.getOrDefault(aspectName, 0xFFFFFF);
    }
}
