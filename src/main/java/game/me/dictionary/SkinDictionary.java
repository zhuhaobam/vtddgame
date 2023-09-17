package game.me.dictionary;

import game.me.skin.Skin;
import game.me.skin.SkinGradeEnum;
import game.me.voice.Voice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 皮肤
 *
 * @author zh
 */
public class SkinDictionary {

    public final static Map<String, List<Skin>> skinMap = new HashMap<>();

    static {
        Voice v1 = VoiceDictionary.voiceMap.get("v001");
        Voice v11 = VoiceDictionary.voiceMap.get("v0011");
        Skin sunflower = new Skin(1,"花语千桦","sunflowerSkin",
                SkinGradeEnum.COLLECTION_LEVEL,
                v1,
                "file://skin001.static", "file://skin001.daynamic");
        Skin sunflower2 = new Skin(11,"花语无悔","sunflower2Skin",
                SkinGradeEnum.COLLECTION_LEVEL,
                v11,
                "file://skin0011.static", "file://skin0011.daynamic");
        skinMap.put("sunflower", Arrays.asList(sunflower,sunflower2));

        Voice v2 = VoiceDictionary.voiceMap.get("v002");
        Skin rose = new Skin(2,"罗曼玫瑰","roseSkin",
                SkinGradeEnum.EPIC_LEVEL,
                v2,
                "file://skin002.static", "file://skin002.daynamic");
        skinMap.put("rose", Arrays.asList(rose));

        Voice v3 = VoiceDictionary.voiceMap.get("v003");
        Skin kerria = new Skin(3,"金黄棣棠","kerriaSkin",
                SkinGradeEnum.HERO_LEVEL,
                v3,
                "file://skin003.static", "file://skin003.daynamic");
        skinMap.put("kerria", Arrays.asList(kerria));
    }
}
