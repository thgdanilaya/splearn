package org.example;

public class MusicPlayer {
    private Music music;

    //IoC
    public MusicPlayer(Music music) {
        this.music = music;
    }
    public MusicPlayer() {}
    public void setMusic(Music music) {
        this.music = music;
    }

    public void PlayMusic() {
        System.out.println("Playing: " + music.getSong());
    }
}
