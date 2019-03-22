package kata.bowling;

public class StrikeFrame implements Frame {

	private Roll second;
	private Roll third;

	public StrikeFrame(Roll second, Roll third) {
		this.second = second;
		this.third = third;
	}

	private int pointsFromNextFrame() {
		if (second == Roll.STRIKE)
			return second.getScore() + third.getScore();
		return third.getScore();
	}

	@Override
	public int getScore() {
		return Roll.STRIKE.getScore() + pointsFromNextFrame();
	}
}
