package Control;

public class MusicPlayer {
    private Music music;
    String name;
    Integer value;

    public Music getMusic() {
        return music;
    }

    public void setMusic(Music music) {
        this.music = music;
    }

    public String getName() {
        return name;
    }

    public MusicPlayer() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public MusicPlayer(Music music) {
        this.music = music;
    }
    public void kuyla(){
   System.out.println("Kuyladi:"+music.getSong());
}}