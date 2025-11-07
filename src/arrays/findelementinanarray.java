package arrays;

public class findelementinanarray {
    static int search(int arr[], int x) {

        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==x) return i;
        }
        return -1;
    }
    public static void main(String args[])
    {
        int arr[] = { 12, 34, 10, 6, 40 };

        int key = 40;
        int position = search(arr,key);

        if (position == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element Found at Position: "
                    + (position + 1));
    }
}
