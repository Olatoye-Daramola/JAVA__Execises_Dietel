public class EvenNumbers{
	public static void main(String[] args){
		int numberToPrint = 2;
		
		for(int count = 1; count < 201; count +=2){
			System.out.print(numberToPrint + " ");
			
			numberToPrint += 2;
		}	
	}
}
