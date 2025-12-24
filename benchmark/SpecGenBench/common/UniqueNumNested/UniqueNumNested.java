public class UniqueNumNested {

    public static int uniqueNum(int[] arr) {
        for (int i = 0; i < arr.length; ++i) {
            int j = 0;
            while(j < arr.length) {
                if(i != j && arr[i] == arr[j])
                    break;
                j++;
            }
            if(j == arr.length)
                return i;
        }
        return -1;
    }
    
}
