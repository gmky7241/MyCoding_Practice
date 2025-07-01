public class Main {
    public static void main(String[] args){

        int [] arr = { 1,2,3,4,5};


        int sum = 0;
        int s = 10;

        for(int i = 0; i < arr.length; i++){
            if (sum + arr[i] * (arr.length-i)== s){

            }
            sum = sum + arr[i] ;
            System.out.println(arr[i]);
            // System.out.println(-1);


        }}}