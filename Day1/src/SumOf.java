public class SumOf {
    public static void main(String[] args) {
        int[] arr= {2,5,7,9,1,1};

        int sum = 0;

        for(int i : arr){
            sum= sum + i;
        }
        System.out.println(sum);
    }
}
