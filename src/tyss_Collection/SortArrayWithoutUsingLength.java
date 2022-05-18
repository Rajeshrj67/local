package tyss_Collection;

public class SortArrayWithoutUsingLength {
	public static void main(String[] args){
		int[] a = {2,8,4,0,4,8,9,2};
		int count = 0;
		for(int x: a){
			count++;
		}
		System.out.println("Size: "+count);
		for(int i=0; i<count-1 ; i++){
			for(int j=0; j<count-i-1 ; j++){
				if(a[j]>a[j+1]){
					a[j] = a[j]+a[j+1];
					a[j+1] = a[j]-a[j+1];
					a[j] = a[j]-a[j+1];
				}
			}
		}
		for(int i=0; i<count ; i++){
			System.out.println((a[i]));
		}
	}
}