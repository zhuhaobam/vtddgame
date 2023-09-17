package game.me.dictionary;

import game.me.voice.Voice;
import game.me.voice.sound.Sound;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 语音包
 *
 * @author zh
 */
public class VoiceDictionary {

    public final static Map<String, Voice> voiceMap = new HashMap<>();

    static {
        List<Sound> sound001 = Arrays.asList(SoundDictionary.soundMap.get("r001"),
                SoundDictionary.soundMap.get("r002"),
                SoundDictionary.soundMap.get("s001"));
        Voice v001 = new Voice(1, "太阳花的语音包",
                sound001);
        voiceMap.put("v001", v001);

        List<Sound> sound0011 = Arrays.asList(SoundDictionary.soundMap.get("r0011"),
                SoundDictionary.soundMap.get("s0011"));
        Voice v0011 = new Voice(11, "太阳花的语音包2",
                sound0011);
        voiceMap.put("v0011", v0011);




        List<Sound> sound002 = Arrays.asList(SoundDictionary.soundMap.get("r003"),
                SoundDictionary.soundMap.get("r004"),
                SoundDictionary.soundMap.get("s002"),
                SoundDictionary.soundMap.get("f001"));
        Voice v002 = new Voice(2, "玫瑰花的语音包",
                sound002);
        voiceMap.put("v002", v002);


        List<Sound> sound003 = Arrays.asList(SoundDictionary.soundMap.get("r005"),
                SoundDictionary.soundMap.get("r006"),
                SoundDictionary.soundMap.get("s003"));
        Voice v003 = new Voice(3, "棣棠的语音包",
                sound003);
        voiceMap.put("v003", v003);
    }
}
