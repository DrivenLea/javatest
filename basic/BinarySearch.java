package 练习;

public class BinarySearch {

	public static int binarySearch(int[] list, int key) {
		// TODO 自动生成的方法存根
    int low = 0;
    int high = list.length - 1;
    
    while(high >= low) {
    	int mid =(low + high)/ 2;
    	if(key<list[mid])
    		high = mid -1;
    	else if(key==list[mid])
    			return mid;
    	else
    			low= mid + 1;
    }
    
    return -low - 1;
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[] list = {2,4,5,6,7,8,9,11,24,56,78,98,123};
		int i= BinarySearch.binarySearch(list,11 );
		System.out.print(i);
	}
	
}
