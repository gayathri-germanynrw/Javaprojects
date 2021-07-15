package functionalinterfaces;

public class Marks implements CheckValidMark {
	private long rollNo;
	private float englishMark;
	private float mathsMark;

	public Marks(long rollNo, float englishMark, float mathsMark) {

		this.rollNo = rollNo;
		this.englishMark = englishMark;
		this.mathsMark = mathsMark;
	}

	public long getRollNo() {
		return rollNo;
	}

	public float getEnglishMark() {
		return englishMark;
	}

	public float getMathsMark() {
		return mathsMark;
	}

	@Override
	public void validMark() {

	}

}
