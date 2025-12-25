import java.util.HashMap;

public class DoubleExistsOptimized {
	
	public static boolean CheckIfExist(int [] arr) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i=0;i<arr.length;i++) {
			map.put(arr[i],i);
		}
		
		for(int i=0;i<arr.length;i++) {
			if(map.containsKey(2*arr[i])&& i!= map.get(2*arr[i])) {
				return true;
			}
		}
		
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {4,5,6,1};
		System.out.print(CheckIfExist(arr));

	}

}
