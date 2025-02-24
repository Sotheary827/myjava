
package bubble_sort_Ex;
public class Bubble_Sort_Example {
    
    public static void main(String[] args) {
        // TODO code application logic here
        int arr[] = {6, 4, 1, 2,5};
        
        for(int i = 0; i < arr.length-1; i++){
            for(int j = 0; j<arr.length-1-i; j++){
            if(arr[j] > arr[j+1]){
                int temp = arr[j+1];
                arr[j] = arr[j];
                arr[j+1] = temp;
            }
        }
    }
    for(int i = 0; i < arr.length; i++){
        System.out.println(arr[i]);
    }
  }
}
