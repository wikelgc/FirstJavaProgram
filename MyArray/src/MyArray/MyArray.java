package MyArray;
public class MyArray {
	private static int longth;
	private static int Array[];
	
	public MyArray(int longth,int Arr[]){
		setLongth(longth);
		for(int i=0;i<Arr.length-1;i++){
			Array[i]=Arr[i];
		}			
	}
	
	public  static void  Fstl(){
		int t;
		for(int i=0;i<(longth-1);i++){
			for(int j=0;j<(longth-i-1);j++){
				if(Array[j+1]<Array[j]){
					t = Array[j+1];
					Array[j+1] = Array[j];
					Array[j]=t;
				}
			}	
		}
		for(int i=0;i<longth;i++){
		System.out.println("Array[i]  ");
		}
	}
	
	public static void  Flts(){
		int t;
		for(int i=0;i<(longth-1);i++){
			for(int j=0;j<(longth-i-1);j++){
				if(Array[j+1]<Array[j]){
					t = Array[j+1];
					Array[j+1] = Array[j];
					Array[j]=t;
				}
			}	
		}
		for(int i=longth;i>0;i--){
		System.out.println("Array[i]  ");
		}
	}

	public int getLongth() {
		return longth;
	}

	public void setLongth(int lo) {
			longth = lo;
	}
	

}
