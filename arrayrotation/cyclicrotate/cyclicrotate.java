import java.util.Arrays;

class cyclicrotate{

static void rotatecyclic(int arr[],int n){
	int temp = arr[n-1];
	for(int i=n-1;i>0;i--){
		arr[i]=arr[i-1];
		}
		arr[0]=temp;
	}

static void display(int arr[],int n){
for(int i=0;i<n;i++)
System.out.print(arr[i] + "");
}

public static void main(String[] args) {
	cyclicrotate rotate = new cyclicrotate();
	int arr[]={1,2,3,4,5};
	rotate.rotatecyclic(arr,5);
	rotate.display(arr,5);
	}
}



 





