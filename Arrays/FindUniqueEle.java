package Array.Array;


public class FindUniqueEle {
    
    public static void main(String[] args) {
        int arr[] = {1,1,3,4,4,3,4,4,5,6,7,8,8,7,6,5,6,6,7,8,6,8,7,6,5,5,4,7,5,6,5,7,7,9,11};
        boolean [] b = new boolean[arr.length];
        for(int i =0;i<arr.length;i++){
            if(b[i])continue;
                 int cnt = 1;
            for(int j = i+1; j<arr.length;j++){
                if(arr[i] == arr[j] && !b[j]){
                    cnt++;
                    b[j] = true;
                }
            }
               if(cnt == 1){
                  System.out.print(arr[i] + " ");
           }
        }
    }
}

