package streams;

public abstract class MyComparatorStream implements Comparable<StreamAcNelio>{

	public int compareTo(Integer x, Integer y) {
		if (x > y) {
			return -1;
		}
		if (x < y) {
			return 1;
		}
		return 0;
	}

}
