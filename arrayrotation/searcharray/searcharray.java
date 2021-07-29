class searcharray{

private static int search(int a[ ],int key){

int low=0;
int high=a.length-1;

	while(low<high){
		int mid=(low+high)/2;
		if(key==a[mid])
		return mid;

		if(a[low] <=  a[mid]){
			if(key >= a[low] && key < a[mid] ){
				high=mid-1;
				}

			else {
				low = mid +1;
				}
			}
		else {
			if(key>a[mid] && key<=a[high]){
				low = mid+1;
				}

			else {
				high= mid-1;
				}
		}
	}
return -1;
	}

public static void main(String[] args) {
	int a[]={5,6,7,8,9,4,3,2,1};
	int key=3;
	System.out.println(search(a,key));
	}
}















