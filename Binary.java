import java.util.Scanner;

public class Binary
{
    public static void main(String[] args) {
        int[] arr =  {12,13,14,15,16,17,18,19,57,59};
        Scanner sc = new Scanner(System.in);
        int target;
        System.out.println("enter element");
        target = sc.nextInt();
        System.out.println("Element found at index : " + Binary_Search(arr, target));
        sc.close();
    }
    public static int Binary_Search(int[] arr, int target)
    {
        int start_node = 0;
        int end_node = arr.length-1;
        int mid_node;

        while (start_node<=end_node) {
            mid_node = (start_node+end_node)/2;
            System.err.println(arr[mid_node]);
            if (arr[mid_node] == target) {
                // System.out.println("Searched number is present on Index : " + mid_node);
                return mid_node;
                
            }
            else if(arr[mid_node]> target)
            {
                // System.out.println(arr[end_node]);
                end_node = mid_node-1;

            }
            else{
                start_node = mid_node+1;
                // System.out.println(arr[start_node]);

            }
            
        }
        return -1;
    }
}