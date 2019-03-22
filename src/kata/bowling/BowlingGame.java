package kata.bowling;

import java.util.ArrayList;
import java.util.List;

public class BowlingGame {

	private static final int MAX_FRAMES = 10;

	private List<Frame> frames;

	private int score = 0;

	public BowlingGame(List<Frame> frames) {
		if (frames == null || frames.size() == 0)
			throw new IllegalArgumentException("Frames can't be empty");
		this.frames = frames;
	}

	public int getScore() {
		frames.forEach(f -> score += f.getScore());
		return score;
	}

	public static BowlingGame startGame(String line) {
		line = line.replaceAll("\\s", "");
		List<Frame> frames = new ArrayList<>();

		int remainingFrames = MAX_FRAMES;

		while (remainingFrames > 0) {
			Roll first = Roll.of(line.charAt(0));
			Roll second = Roll.of(line.charAt(1));

			if (first == Roll.STRIKE) {
				frames.add(new StrikeFrame(second, Roll.of(line.charAt(2))));
				line = line.substring(1);
			} else if (second == Roll.SPARE) {
				frames.add(new SpareFrame(first, Roll.of(line.charAt(2))));
				line = line.substring(2);
			} else {
				frames.add(new SimpleFrame(first, second));
				line = line.substring(2);
			}

			remainingFrames--;
		}

		return new BowlingGame(frames);
	}

}
