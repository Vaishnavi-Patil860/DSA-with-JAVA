package array;


public class FindPrimeNoInArr {
    public static void main(String[] args) {
        int [] arr = {1,2,3,5,7,4,8,9,29,31,13,17,51,37};

        for(int ele : arr)
            if(isPrime(ele))
                System.out.println(ele + " ");
            }
        
        public static boolean isPrime(int ele){
            if(ele < 2) return false;
        
        for(int i = 2; i <= ele/2 ;i++)
            if(ele % i == 0) return false ;
            return true;
        
        }
    }

