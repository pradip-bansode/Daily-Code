public class Smallest {
    public static void main(String[] args) {
        int[] arr = {5,3,67,3,8,4,1,8};

        int min = arr[0];

        for(int i = 0; i < arr.length;i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("smallest element = "+ min);
    }
}
