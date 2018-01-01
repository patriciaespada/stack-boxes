import java.util.TreeSet;

/**
 * You have a stack of n boxes, with widths w, heights h, and depths d.
 * 
 * The boxes cannot be rotated and can only be stacked on top of one another if each box in the stack is 
 * strictly larger than the box above it in width, height, and depth.
 * 
 * Implement a method to compute the height of the tallest possible stack. 
 * The height of a stack is the sum of the heights of each box.
 * 
 * @author patriciaespada
 *
 */
public class MaxStackBoxesHeight {
	
	private static double getStackBoxesHeight(TreeSet<Box> boxes) {
		TreeSet<Box> stackBoxes = new TreeSet<Box>(new StackBoxComparator());
		stackBoxes.addAll(boxes);
		
		double maxHeight = 0;
		for (Box box : stackBoxes) {
			System.out.println(box.toString());
			maxHeight += box.getHeight().doubleValue();
		}
		System.out.println("Current max height: " + maxHeight);
		return maxHeight;
	}
	
	public static void main(String[] args) {
		TreeSet<Box> boxes = new TreeSet<Box>(new MaxHeightBoxComparator());
/*		// equal
		boxes.add(new Box(1.0, 1.0, 1.0));
		boxes.add(new Box(1.0, 1.0, 1.0));
		
		// smaller
		boxes.add(new Box(2.0, 2.0, 2.0));
		boxes.add(new Box(3.0, 3.0, 3.0));
		
		// larger
		boxes.add(new Box(10.0, 10.0, 10.0));
		boxes.add(new Box(4.0, 6.0, 9.0));
		
		// other
		boxes.add(new Box(10.0, 10.0, 10.0));
		boxes.add(new Box(12.0, 11.0, 1.0));
		
		boxes.add(new Box(3.0, 5.0, 3.0));
		
		boxes.add(new Box(12.0, 41.0, 1.5)); */
		
		boxes.add(new Box(13.0, 65.0, 33.0));
		boxes.add(new Box(16.0, 55.0, 21.0));
		boxes.add(new Box(12.0, 40.0, 35.0));
		boxes.add(new Box(18.0, 22.0, 12.0));
		boxes.add(new Box(21.0, 12.0, 21.0));
		boxes.add(new Box(10.0, 10.0, 10.0));
		boxes.add(new Box(25.0, 30.0, 40.0));
		boxes.add(new Box(19.0, 25.0, 22.0));
		boxes.add(new Box(14.0, 22.0, 17.0));
		boxes.add(new Box(10.0, 10.0, 10.0));
		
		System.out.println("All boxes:");
		for (Box box : boxes) {
			System.out.println(box.toString());
		}

		
		double maxHeight = 0;
		double currentMaxHeight = 0;
		do {
			System.out.println("-------------");
			maxHeight = currentMaxHeight;
			currentMaxHeight = getStackBoxesHeight(boxes);
			boxes.pollFirst();
		} while (currentMaxHeight > maxHeight);
		
		
		System.out.println(maxHeight);
	}
	
}
