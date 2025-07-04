package array.array;

public class FirstNonRepeatingEle {
    public static void main(String[] args) {
        char [] arr = {'a','a','c','c','d','d'};
        printNonRepeatingEle(arr,arr.length);
    }
    public static void printNonRepeatingEle(char []a,int len){
       boolean [] b = new boolean[len];
       for(int i=0; i<len;i++){
        if(b[i])continue;
         boolean flag = false;
        for(int j=i+1;j<len;j++){
            if(a[i] == a[j] && !b[j]){
                
                b[j]=true;
                flag = true;
                break;

            }
         }
         if(!flag){
            System.out.println(a[i]);
            return;
        }
       else{
        System.out.println("no non repeating elements found");
       }
     }
  }
}


