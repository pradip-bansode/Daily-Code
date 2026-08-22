public class PalindromeArray {
    public static void main(String[] args) {
        int [] arr = {1,2,1};
        int F = 0;
        int L = arr.length-1;
        while (F <= L && arr[F] == arr[L]) {
            F++;
            L--;
        }
        if(F > L){
            System.out.println("is the palindrwn arry");
        }else{
            System.out.println(" not palidrewn arrsay");
        }
    }
}
