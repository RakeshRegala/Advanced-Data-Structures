import java.util.*;
class BinarySearch{
	public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of elements:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);

        System.out.println("Enter Key to be Searched: ");
        int key=sc.nextInt();
        long st=System.nanoTime();
        int p=search(arr,key,n);
        long end=System.nanoTime();


        if(p==-1)
            System.out.println("Key is not found");
        else
            System.out.println("Key is found at index: "+p);

        System.out.println("time taken: "+(end-st)+" nanoseconds");
	}
    static int search(int a[],int key,int n){
        int low=0,high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(key==a[mid]){
                return mid;
            }
            else if(key<a[mid]){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return -1;
    }
}
