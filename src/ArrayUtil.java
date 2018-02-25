
public class ArrayUtil {

	/**
	 * Reverse elements of array arr Precondition: arr.length > 0. Postcondition:
	 * The elements of arr have been reversed
	 * 
	 * @param arr
	 *            the array to manipulate
	 */
	public static void reverseArray(int[] arr) {
		int start = 0, end = arr.length - 1;
		for (int i = 0; i < arr.length / 2; i++) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
}

class Matrix {
	private int[][] mat;

	public Matrix(int[][] m) {
		mat = m;
	}

	/**
	 * Revereses the elements in each row of mat. Postcondition: The elements in
	 * each row have been reversed
	 */
	public void reverseAllRows() {
		for (int i = 0; i < mat.length; i++) {
			int start = 0, end = mat[i].length - 1;
			for (int j = 0; j < mat[i].length / 2; j++) {
				int temp = mat[i][start];
				mat[i][start] = mat[i][end];
				mat[i][end] = temp;
				start++;
				end--;
			}
		}
	}

	/**
	 * Reverses the elements of mat. Postcondition: - The final elements of mat,
	 * when read in row-major order, are the same as the original elements of mat
	 * when read from the bottom corner, right to left, going upward. - mat[0][0]
	 * contains what was originally the last element. - mat[mat.length -
	 * 1][mat[0].length -1] contains what was originally the first element.
	 */
	public void reverseMatrix() {
		reverseAllRows();
		int start = 0, end = mat.length - 1;
		for (int i = 0; i < mat.length / 2; i++) {
			int[] temp = mat[start];
			mat[start] = mat[end];
			mat[end] = temp;
			start++;
			end--;
		}
	}

	public int[][] getIntArray() {
		return mat;
	}
}
