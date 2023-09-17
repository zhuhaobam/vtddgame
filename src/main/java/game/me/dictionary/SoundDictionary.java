package game.me.dictionary;

import game.me.behavior.BehaviorClassificationEnum;
import game.me.voice.sound.Sound;
import game.me.voice.sound.SoundClassificationEnum;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 音效
 *
 * @author zh
 */
public class SoundDictionary {

    public final static Map<String, Sound> soundMap = new HashMap<>();

    static {
        // 例如随机的语音
        List<BehaviorClassificationEnum> behavior1 = new ArrayList<>();
        behavior1.add(BehaviorClassificationEnum.WALK);

        Sound r001 = new Sound(1, "你好漂亮啊", "file://r001.m4a", behavior1, SoundClassificationEnum.RANDOM);
        Sound r0011 = new Sound(11, "你是我的终极追求", "file://r0011.m4a", behavior1, SoundClassificationEnum.RANDOM);
        Sound r002 = new Sound(2, "你来和我一起玩吗", "file://r002.m4a", behavior1, SoundClassificationEnum.RANDOM);
        Sound r003 = new Sound(3, "吃我一记缠绕", "file://r003.m4a", behavior1, SoundClassificationEnum.RANDOM);
        Sound r004 = new Sound(4, "我又回来了", "file://r004.m4a", behavior1, SoundClassificationEnum.RANDOM);
        Sound r005 = new Sound(5, "我还是那么温柔", "file://r005.m4a", behavior1, SoundClassificationEnum.RANDOM);
        Sound r006 = new Sound(6, "水容万物", "file://r006.m4a", behavior1, SoundClassificationEnum.RANDOM);
        soundMap.put("r001", r001);
        soundMap.put("r0011", r0011);
        soundMap.put("r002", r002);
        soundMap.put("r003", r003);
        soundMap.put("r004", r004);
        soundMap.put("r005", r005);
        soundMap.put("r006", r006);

        // 例如战斗的语音
        List<BehaviorClassificationEnum> behavior2 = new ArrayList<>();
        behavior2.add(BehaviorClassificationEnum.FIGHT);

        Sound s001 = new Sound(11, "花开万物", "file://s001.m4a", behavior2, SoundClassificationEnum.RELEASE_SKILLS);
        Sound s0011 = new Sound(111, "一帘幽梦", "file://s0011.m4a", behavior2, SoundClassificationEnum.RELEASE_SKILLS);
        Sound s002 = new Sound(12, "蛮横缠绕", "file://s002.m4a", behavior2, SoundClassificationEnum.RELEASE_SKILLS);
        Sound s003 = new Sound(13, "落叶飞花", "file://s003.m4a", behavior2, SoundClassificationEnum.RELEASE_SKILLS);
        soundMap.put("s001", s001);
        soundMap.put("s0011", s0011);
        soundMap.put("s002", s002);
        soundMap.put("s003", s003);


        List<BehaviorClassificationEnum> behavior3 = new ArrayList<>();
        behavior3.add(BehaviorClassificationEnum.DEVELOP);

        Sound f001 = new Sound(111, "睡不醒的梦", "file://f001.m4a", behavior3, SoundClassificationEnum.RANDOM);
        soundMap.put("f001", f001);
    }
}
