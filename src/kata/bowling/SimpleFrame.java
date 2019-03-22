package kata.bowling;

public class SimpleFrame implements Frame {

	private Roll first;
	private Roll second;

	public SimpleFrame(Roll first, Roll second) {
		this.first = first;
		this.second = second;
	}

	@Override
	public int getScore() {
		return first.getScore() + second.getScore();
	}
}
