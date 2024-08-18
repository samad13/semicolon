import java.util.Scanner;
public class App{
	public static void main(String[] args){
	
	String q1 = "what colors are my favorite shoes?\n" + "(a)black\n(b)red\n(c)blue";
	String q2 = "what colors are my favorite cloth?\n" + "(a)black\n(b)red\n(c)blue";


	Student [] students ={

	new Student(subject1, subject2, subject3),
	new Student(),
	new Student(),
	new Student()
	};

	mockTest(questions);


}


public static void mockTest(Question [] questions){
	int score = 0;
	Scanner input = new Scanner(System.in);

for(int i = 0; i < questions.length; i++){
	System.out.println(questions[i].prompt);
	String answer = input.nextLine();
	if(answer.equals(questions[i].answer)){
	score++;

}
}System.out.println("You got "+ score + " out of "+ questions.length);





}




}	v