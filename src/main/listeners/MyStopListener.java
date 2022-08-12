package main.listeners;

import main.BeatBox;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyStopListener implements ActionListener {
    private final BeatBox beatBox;
    public MyStopListener(BeatBox beatBox) {
        this.beatBox = beatBox;
    }

    public void actionPerformed(ActionEvent a) {
        beatBox.sequencer.stop();
    }
}