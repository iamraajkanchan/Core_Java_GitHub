package programs.patterns.adapter;

public class MediaAdapter implements MediaPlayer {

    private AdvancedMediaPlayer player;

    public MediaAdapter(AdvancedMediaPlayer player) {
        this.player = player;
    }

    @Override
    public void play(String audioType, String fileName) {
        player.play(fileName);
    }
}
