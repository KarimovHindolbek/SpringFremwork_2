package Control;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainBean {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
//        Music musicbean = context.getBean("musicbean", Music.class);
//        MusicPlayer musicPlayer=new MusicPlayer(musicbean);
//        musicPlayer.kuyla();
        MusicPlayer musicPlayer=context.getBean("musicplayer",MusicPlayer.class);
        musicPlayer.kuyla();
        context.close();



    }
}
