package kata.bowling;

import java.util.Objects;

public class SpareFrame implements Frame {

	@SuppressWarnings("unused")
	private Roll first;
	private Roll third;

	public SpareFrame(Roll first, Roll third) {
		this.first = Objects.requireNonNull(first);
		this.third = Objects.requireNonNull(third);
	}

	@Override
	public int getScore() {
		return Roll.SPARE.getScore() + third.getScore();
	}
}
