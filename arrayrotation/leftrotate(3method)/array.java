//----------------------------------------------------Array left rotation..................------------------------------------

class array{

public void leftRotateArray(int a[ ], int d,int n)
	{
	for(int i=0;i<d;i++)
	leftrotate(a,n);
	}

public void leftrotate(int a[ ],int n)
	{
	int i,temp;
	temp = a[0];
	for(i=0;i<n-1;i++){
	a[i] = a[i+1];
	}
	a[n-1] = temp;
}

public void printArray(int a[],int n){
	for(int i=0;i<n;i++)
	System.out.print(a[i]);
	} 



public static void main(String[] args) {
	array rotate= new array();
	int a[] = {1,2,3,4,5,6,7,8};
	rotate.leftRotateArray(a,2,8);
	rotate.printArray(a,8);
	}

}

























