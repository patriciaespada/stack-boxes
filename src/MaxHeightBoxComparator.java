import java.util.Comparator;

public class MaxHeightBoxComparator implements Comparator<Box> {

	@Override
	public int compare(Box box1, Box box2) {
		if (box1.getHeight().compareTo(box2.getHeight()) > 0) {
			return -1;
		} else {
			return 1;
		}
	}

}
