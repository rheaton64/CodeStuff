package summertech;

public class test {

	public static void main(String[] args) {
		HashMap hash = new HashMap();
		for(int i = 0; i < 100; i++){
			hash.put(i, i);
		}
		hash.reSize();
		//System.out.println(((((123<<2)*345)>>>3)*2)%128);
	}

}

