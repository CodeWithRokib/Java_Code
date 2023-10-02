package PracticeJava;

public class BubbleSorting {
    public static void main(String[] args) {
        int arr[] = {30,29,31,28,45,22};
        for (int i = 0; i<arr.length; i++){
            for (int j = 0; j<arr.length; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println(arr);
    }
}
