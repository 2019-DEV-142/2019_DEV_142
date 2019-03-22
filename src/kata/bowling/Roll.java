package kata.bowling;

public enum Roll {
	MISS('-', 0), STRIKE('X', 10), SPARE('/', 10), NINE('9', 9), EIGHT('8', 8), SEVEN('7', 7), SIX('6', 6),
	FIVE('5', 5), FOUR('4', 4), THREE('3', 3), TWO('2', 2), ONE('1', 1);

	private char input;
	private int score;

	Roll(char input, int score) {
		this.input = input;
		this.score = score;
	}

	public int getScore() {
		return score;
	}

	public static Roll of(char c) {
		for (Roll roll : values()) {
			if (roll.input == c) {
				return roll;
			}
		}

		throw new IllegalArgumentException();
	}

}
