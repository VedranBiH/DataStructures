package stack;

/**
 * Implement stack with an array
 * 
 * @author vedran
 *
 */
public class Stack {

	private Integer[] ary;
	private int index = 0;

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
		return ary.length == 0;
	}

	public void push(int element) {
		if (index >= ary.length) {
			ary[index] = element;
			index++;
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
