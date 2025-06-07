package programs.patterns.adapter;

import programs.utility.Utility;

public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void play(String fileName) {
        Utility.printToLogcat(Mp4Player.class, Thread.currentThread().getStackTrace().length >= 2 ? Thread.currentThread().getStackTrace()[2] : null, "fileName : " + fileName);
    }
}
