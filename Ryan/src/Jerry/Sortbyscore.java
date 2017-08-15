package Jerry;

import java.util.Comparator;

public class Sortbyscore implements Comparator<Contractor>{

	@Override
	public int compare(Contractor a, Contractor b) {
			
		return a.score-b.score;
	}

}
