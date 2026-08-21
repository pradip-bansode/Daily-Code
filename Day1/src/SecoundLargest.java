public class SecoundLargest {
    public static void main(String[] args) {
        int[] arr= {4,6,3,63,6,2,5,7};

        int large=arr[0];
        int sLarge= 0;

        for(int i : arr){
            if(i > large){
                sLarge=large;
                large=i;
            }
            if(i < large && i > sLarge){
                sLarge=i;
            }
        }
        System.out.println("large = "+ large + " slarge = "+ sLarge);

    }
}
