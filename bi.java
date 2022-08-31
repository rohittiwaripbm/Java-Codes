import java.util.Scanner;
// time complexity :-  O(n) worst case
// best case : - O(1)
public class bi {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int[] arr = {25,26,27,28,29,30,31,32};
        int target;
        System.out.println("Enter number to search");
        target = sc.nextInt();
        if (Search(arr, target)<0) {
            System.out.println("Number is not present");
        }
        else{

        System.out.println("Searched number is present on Index : " + Search(arr, target) );

        }
      
        sc.close();

    }
    public static int Search(int[] arr, int target)
    {

        int start_node = 0;
        int end_node = arr.length-1;
        int mid_node;

        while (start_node<=end_node) {
            mid_node = (start_node+end_node)/2;
            if (arr[mid_node] == target) {
                // System.out.println("Searched number is present on Index : " + mid_node);
                return mid_node;
                
            }
            else if(arr[mid_node]> target)
            {
                end_node = mid_node-1;

            }
            else{
                start_node = mid_node+1;
            }
            
        }
        return -1;
    }
}
