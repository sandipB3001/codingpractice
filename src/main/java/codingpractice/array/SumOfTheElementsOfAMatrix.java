package codingpractice.array;

public class SumOfTheElementsOfAMatrix {

	public static void main(String[] args) {
		int [][]arr = {{1,2,3},{4,5,6},{7,8,9}};
		int sum = 0;

		System.out.println(sumOfMatrix(arr, 0, 0, sum));
	}

	public static int sumOfMatrix(int [][]arr, int i, int j, int sum) {
		if(i==arr.length)
			return sum;
		else if(j==arr[0].length) {
			++i;
			j=0;
			return sumOfMatrix(arr, i, j, sum);
		}
		else{
			sum+=arr[i][j++];
			return sumOfMatrix(arr, i, j, sum);
		}
	}
}

//i/p : {{1,2,3},{4,5,6},{7,8,9}}
//o/p : 45
//Time complexity: O(n)/O(n^2)?? and Space Complexity: O(1)