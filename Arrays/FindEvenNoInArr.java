package array;

public class FindEvenNoInArr {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6};

            for(int ele : arr){
                if(isEven (ele)){
               System.out.println(ele + " ");
            }
        }
    }
        public static boolean isEven(int ele){
            return ele % 2 == 0;
        }
        
    }


