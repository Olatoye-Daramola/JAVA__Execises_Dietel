public class EvenNumbers2{
	public static void main(String[] args){
		int numberToPrint = 1;
		
		for(int count = 1; count < 201; count ++){
			if(numberToPrint % 2 == 0){
				System.out.print(numberToPrint + " ");
				}
			numberToPrint += 1;
		}	
	}
}
