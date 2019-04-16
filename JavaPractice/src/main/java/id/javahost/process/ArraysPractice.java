package id.javahost.process;

public class ArraysPractice {
	public static void main (String[] args){
		String nilai = args[0].replace("[", "").replace("]", "");
		String[] parse = nilai.split(",");
		int[] parseInt = new int[parse.length];
		int[] hasilInt = new int[parse.length];
		for (int i=0;i<parse.length;i++){
			parseInt[i] = Integer.parseInt(parse[i]);
		}
		
		hasilInt = cyclicArray(parseInt, Integer.parseInt(args[1]));
		for (int j=0;j<hasilInt.length;j++){
			if (j==0){
				System.out.print("[");
				System.out.print(hasilInt[j]+",");
			}else if (j==hasilInt.length-1){
				System.out.print(hasilInt[j]);
				System.out.print("]");
			}else{
				System.out.print(hasilInt[j]+",");
			}
			
		}
		System.out.println();
	}
	
	public static int[] cyclicArray(int[] A, int K){
		int[] hasil = new int[A.length];
		
		for(int y=0;y<K;y++){
			for(int z=0;z<A.length;z++){
				if (z==(A.length-1)){
					hasil[0]=A[z];
				}else{
					hasil[z+1] = A[z];
				}
			}
			if (y<K-1){
				for(int zi=0;zi<A.length;zi++){
					A[zi] = hasil[zi];
				}
			}
		}
		return hasil;
	}
}
