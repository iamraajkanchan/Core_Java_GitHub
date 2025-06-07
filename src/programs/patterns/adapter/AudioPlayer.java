package programs.patterns.adapter;

import programs.utility.Utility;

public class AudioPlayer implements MediaPlayer {
    private MediaAdapter adapter;

    @Override
    public void play(String audioType, String fileName) {
        AdvancedMediaPlayer player;
        switch (audioType.toLowerCase()) {
            case "mp4": {
                player = new Mp4Player();
                break;
            }
            case "vlc": {
                player = new VLCPlayer();
                break;
            }
            default: {
                Utility.printToLogcat(AudioPlayer.class, Thread.currentThread().getStackTrace().length >= 2 ? Thread.currentThread().getStackTrace()[2] : null, "Invalid Format!!!");
                return;
            }
        }
        player.play(fileName);
    }
}
