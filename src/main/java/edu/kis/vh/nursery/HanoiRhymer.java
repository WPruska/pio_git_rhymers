package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {
	int totalRejected = 0;

	public int reportRejected() {
		return totalRejected;
	}

	public void countIn(int in) {
		if (!callCheck() && in > peekaboo()){ //poprawa wcięć i brakującej klamry
			totalRejected++;
		} else { //dadanie brakującej klamry
			super.countIn(in);//poprawa wcięć
		} //dadanie brakującej klamry
	}
}
//alt + ->/alt + <- zmienia zakładki(pliki) widoczne w górnym panelu
