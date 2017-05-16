
public class Gradeexam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int testsscore = 85;
		char grade;
		if(testsscore >=95){
			grade = 'A';
			
		}
		else if(testsscore >=90){
			grade ='B';
			
		}
		else if(testsscore >=70){
			grade = 'C';
			
		}
		else if(testsscore >=65){
			grade = 'D';
		}
		else{
			grade = 'F';
		}
		System.out.println("My grade ="+grade);

	}

}
