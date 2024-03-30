import java.util.Scanner;
class Student{
       int id_no;
       int no_of_subjects_registered;
       int[] subject_code;
       int[] subject_credits;
       String[] grade_obtained;
       double spi;
       Student(int i){
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter the student id_no:");
           this.id_no = sc.nextInt();

           System.out.println("Enter the student no_of_subjects_registered:");
           this.no_of_subjects_registered = sc.nextInt();

           subject_code = new int[no_of_subjects_registered];

           
           subject_credits = new int[no_of_subjects_registered];

           
           grade_obtained = new String[no_of_subjects_registered];
               
            for( int j=0;j<no_of_subjects_registered;j++){
                    System.out.println("Enter the student subject_code:");
                    this.subject_code[j] = sc.nextInt();

                    System.out.println("Enter the student subject_credits:");
                    this.subject_credits[j] = sc.nextInt();

                    System.out.println("Enter the student grade_obtained:");
                    this.grade_obtained[j] = sc.next();
            } 

       }

       double SPI( ){
       	   int sum=0;
           int sum_credits=0;
           int marks = 0;
           for(int j=0;j<no_of_subjects_registered;j++){
            if(grade_obtained.equalsto("A+")){
                 marks = 
            }
           }

       }
}

public class Lab6_1{
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		Student[] stu = new Student[n];
		
		for(int i=0;i<n;i++){
			stu[i] = new Student(i);
		}

		for(int j=0;j<n;j++){
			System.out.println("SPI of student"+j+"is"+stu[j].SPI());
		}
	}
}