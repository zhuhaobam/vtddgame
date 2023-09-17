package game.me.voice.sound;

import game.me.behavior.BehaviorClassificationEnum;

import java.util.List;

/**
 * 音效
 *
 * @author zh
 */
public class Sound {

    /**
     * 音效序号
     */
    private int no;

    /**
     * 音效文字
     */
    private String name;

    /**
     * 音效文件
     */
    private String file;

    /**
     * 行为分类
     */
    private List<BehaviorClassificationEnum> behaviorClassifications;

    /**
     * 音效分类
     */
    private SoundClassificationEnum soundClassification;


    public Sound() {
    }

    public Sound(int no, String name, String file, List<BehaviorClassificationEnum> behaviorClassifications, SoundClassificationEnum soundClassification) {
        this.no = no;
        this.name = name;
        this.file = file;
        this.behaviorClassifications = behaviorClassifications;
        this.soundClassification = soundClassification;
    }

    public int getNo() {
        return no;
    }

    public String getName() {
        return name;
    }

    public String getFile() {
        return file;
    }

    public List<BehaviorClassificationEnum> getBehaviorClassifications() {
        return behaviorClassifications;
    }

    public SoundClassificationEnum getSoundClassification() {
        return soundClassification;
    }
}
