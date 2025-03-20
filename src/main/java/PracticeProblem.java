public class PracticeProblem {

	public static void main(String args[]) {
		
	}

	public static void bubbleSortString(String[] strings) {
		boolean swapped = true;
		for(int i = 0; i < strings.length && swapped; i++){
			swapped = false;
			for(int j = 0; j < strings.length - 1 - i; j++){
				if(strings[j].compareToIgnoreCase(strings[j+1]) > 0){
					String temp = strings[j];
					strings[j] = strings[j+1];
					strings[j+1] = temp;
					swapped = true;
				}
			}
			if(!swapped){
				i = strings.length;
			}
		}
	}
}
