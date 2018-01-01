import java.util.Comparator;

public class StackBoxComparator implements Comparator<Box>{

	@Override
	public int compare(Box box1, Box box2) { // compare in descending order
		/*
		 * This comparator compares two boxes and store them in descending order (larger to smaller).
		 *  . return -1 if it's larger in all attributes;
		 *  . return 1 if it's smaller in all attributes;
		 *  . return 0 if it's equal (we cannot stack equal boxes) or if it's smaller in some attributes
		 */
		if (box1.getWidth().compareTo(box2.getWidth()) > 0
				&& box1.getHeight().compareTo(box2.getHeight()) > 0
				&& box1.getDepth().compareTo(box2.getDepth()) > 0) { // greater
			return -1;	
		} else if (box1.getWidth().compareTo(box2.getWidth()) < 0
				&& box1.getHeight().compareTo(box2.getHeight()) < 0
				&& box1.getDepth().compareTo(box2.getDepth()) < 0) { // less
			return 1;
		} else { // equal
			return 0;
		}
	}

}
