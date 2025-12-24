public class SelectionSortDesc {
    //@ requires arr != null;
    //@ ensures (\forall int j; 0 <= j && j < arr.length; (\forall int k; j < k && k < arr.length; arr[j] >= arr[k]));
    public static void selectionSort(int[] arr){
        //@ maintaining 0 <= i && i <= arr.length;
        //@ maintaining (\forall int j; 0 <= j && j < i; (\forall int k; j < k && k < arr.length; arr[j] >= arr[k]));
        //@ decreases arr.length - i;
        for (int i = 0; i < arr.length - 1; i++)  
        {  
            int index = i;
            //@ maintaining i + 1 <= j && j <= arr.length;
            //@ maintaining i <= index && index < arr.length;
            //@ maintaining (\forall int k; i + 1 <= k && k < j; arr[index] >= arr[k]);
            //@ decreases arr.length - j;
            for (int j = i + 1; j < arr.length; j++){  
                if (arr[j] > arr[index]){  
                    index = j;
                }  
            }  
            int smallerNumber = arr[index];   
            arr[index] = arr[i];  
            arr[i] = smallerNumber;
            //@ assume (\forall int k; i + 1 <= k && k < arr.length; arr[i] >= arr[k]);
        }  
    }
}