public class RepeatedNumNested {

    public static int repeatedNum(int[] arr) {
        for (int i = 0; i < arr.length; ++i) {
            for (int j = i + 1; j < arr.length; ++j) {
                if(arr[i] == arr[j])
                    return i;
            }
        }
        return -1;
    }
    
}
