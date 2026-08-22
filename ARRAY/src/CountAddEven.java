public class CountAddEven {
    public static void main(String[] args) {
        int[] arr = {1,2,4,56,0,7,4,7,4,8,1};

        int even = 0;
        int odd = 0;
//        for(int i = 0; i < arr.length;i++){
//            if(arr[i] % 2 == 0){
//                even++;
//            }else{
//                odd++;
//            }
//
//        }
        for(int i : arr){
            if(i % 2 ==0){
                even++;
            }else{
                odd++;
            }
        }
        System.out.println("even number = "+ even+ " odd number = "+odd );
    }

}
