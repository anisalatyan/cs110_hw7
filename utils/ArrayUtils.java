package utils;
public class ArrayUtils {
	public static void reverse(int[] arr) {
        for(int i = 0; i < arr.length / 2; i++){
            int num = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[(arr.length - i) - 1] = num;
        } 
    }
    public static String stringifyArray(int[] arr) {
    	String result = "";
        for (int i = 0; i < arr.length; i++) {
        	if(i == arr.length - 1) {
        		result += arr[i];
        	} else {
        		result += (arr[i])+ ",";
        	}
        }
        return result;
    }
}