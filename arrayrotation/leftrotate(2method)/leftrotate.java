import java.io.*;

class leftrotate{

 void rotateleft(int arr[],int d,int n){
	if(d==0)
	return;

	d=d%n;                                                               //if rotate is greater than array
	arrayrotate(arr,0,d-1);
	arrayrotate(arr,d,n-1);
	arrayrotate(arr,0,n-1);
	}

	 void arrayrotate(int arr[],int start,int end)
	{
	int temp;
	while(start<end){
		temp=arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
		start++;
		end--;
		}
	}

//print arrayrotation

	void printarry(int arr[],int size){
	for(int i=0;i<size;i++)
	System.out.print(arr[i] + " ");
	}

public static void main(String[] args) {
	leftrotate rotate =  new leftrotate();
	int arr[] = {1,2,3,4,5,6,7};
	rotate.rotateleft(arr,2,7);
	rotate.printarry(arr,7);

	}

}
