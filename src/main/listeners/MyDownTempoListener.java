package main.listeners;

import main.BeatBox;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyDownTempoListener implements ActionListener {
    private final BeatBox beatBox;
    public MyDownTempoListener(BeatBox beatBox) {
        this.beatBox = beatBox;
    }

    public void actionPerformed(ActionEvent a) {
        float tempoFactor = beatBox.sequencer.getTempoFactor();
        beatBox.sequencer.setTempoFactor((float) (tempoFactor * 0.97));
    }
}