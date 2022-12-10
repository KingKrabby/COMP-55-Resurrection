package classes;

import javafx.util.Duration;
import java.util.Scanner;

//
public class Conductor {
	private double BPM;
	private double currentBeat;
	private Song song;
	private int reactionTime;
	private Food mapNotes[];

	public Conductor(double bpm, Song music, int speed, Food notes[]) {
		BPM = bpm;
		song = music;
		reactionTime = speed;
		mapNotes = notes;
	}

	void setBPM(int bpm) {
		BPM = bpm;
	}

	double getBPM() {
		return BPM;
	}

	void setBPM(double bpm) {
		BPM = bpm;
	}

	void playSong(String level) {
		song.playSound("sounds", level + ".mp3");
	}

	void stopSong(String level) {
		song.stopSound("sounds", level + ".mp3");
	}

	double getCurrentBeat(String level) {
		System.out.println(level);
		System.out.println(song.toString());
		if (song.findSound("sounds", level + ".mp3") == null) {
			return 0;
		}
		Duration songDuration = song.findSound("sounds", level + ".mp3").getCurrentTime();
		double currentPos = (double) songDuration.toSeconds();
		currentBeat = currentPos * (BPM / 60);
		return currentBeat;
	}

	Food getCurrentNote(String level) {
		double currentBeat = getCurrentBeat(level);
		for (int i = 0; i < mapNotes.length; i++) {
			if (mapNotes[i].getSpawnBeat() > Math.ceil(currentBeat)) {
				return mapNotes[i];
			}
		}
		return null;
	}

	public static void main(String[] args) {

	}
}
