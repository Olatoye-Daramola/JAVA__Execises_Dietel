public class Zeros{
	public static void main(String[] args){
		System.out.println("N \t10*N \t100*N \t1000*N");
		
		int count = 1;
		int N = 1;
		
		while(count <= 5){
			System.out.println(N + "\t" + 10*N + "\t" + 100*N + "\t" + 1000*N);
			
			++count;
			N++;
		}
	}
}
