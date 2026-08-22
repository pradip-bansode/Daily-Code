public class LargestNum {
    public static void main(String[] args) {
       int[] arr = {1,3,5,7,3,2};
       int max = arr[0];

       for(int i = 0; i < arr.length;i++){
           if(max < arr[i]){
               max= arr[i];
           }
       }
        System.out.println("largest num = " + max);

    }
}
