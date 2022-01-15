package stack;

/**
 * Implement stack with an array
 * 
 * @author vedran
 *
 */
public class Stack {

	private Integer[] ary;
	private int index = -1;

	/**
	 * @param size initialize stack with a specific size
	 */
	public Stack(int size) {
		if (size <= 0) {
			throw new IllegalArgumentException("Size cannot be <= 0");
		}
		ary = new Integer[size];
	}

	/**
	 * @return true/false if stack length is 0
	 */
	public boolean isEmpty() {
		return index == -1;
	}

	public void push(int element) {
		index++;
		if (index < ary.length) {
			ary[index] = element;
		} else {
			throw new IllegalArgumentException("Not enough room in stack. Please remove item(s) to add more");
		}
	}

	/**
	 * 
	 * @return null if stack has no element otherwise the top element
	 */
	public Integer peek() {
		return this.isEmpty() ? null : ary[index];
	}

	/**
	 * 
	 * @return remove the top element and return it otherwise if stack is empty
	 *         return null
	 */
	public Integer pop() {
		if (!this.isEmpty()) {
			int element = ary[index];
			ary[index] = null;
			index--;
			return element;
		} else {
			return null;
		}
	}

}
