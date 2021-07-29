//Write a function rotate(ar[], d, n) that rotates arr[] of size n by d elements. 
 

class leftrotate{
void rotateleft(int arr[ ],int d,int n){
	int i,j,k,temp;
	d=d%n;
	int gcd = gcd(n,d);
	for(i=0;i<gcd;i++)
		{
		temp = arr[i];
		j=i;
		while(true){
			k= j+d;
			if(k >= n)
			k=k-n;

			if(k==i)
			break;
			
			arr[j]=arr[k];
			j=k;
		}
		arr[j]=temp;
	}
}


//calculate gcd 

int gcd(int a,int b){
	if(b==0)
	return a;
else
	return gcd(b, a%b );
}

//print array

void printarray(int arr[],int size){
	for(int i=0;i<size;i++)
	System.out.print( arr[i]+" ");
	}



public static void main(String[] args) {
	leftrotate rotate = new leftrotate();
	int arr[] = {1,2,3,4,5,6,7,8,9,10,11,12};
	rotate.rotateleft(arr,4,12);
	rotate.printarray(arr,12);

	}

}














