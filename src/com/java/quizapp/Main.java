package com.java.quizapp;
import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		
		Quiz q = new Quiz();
		q.logic();
		
	}
}

class Quiz {
	
	Scanner sc =new Scanner(System.in);
	int Correctcount=0,Wrongcount=0;
	
	public void logic() {
		printQuizBanner();
		List<Questions> questions = new ArrayList<>();

        // Adding questions to the list
        Questions q1 = new Questions("**General Knowledge:**\n What is the capital of France?",
                "A) London", "B) Paris", "C) Berlin", "D) Rome");
        Questions q2 = new Questions("**Science:**\r\n What is the chemical symbol for water?",
                "A) H2O", "B) CO2", "C) O2", "D) CH4");
        Questions q3 = new Questions("**Mathematics:**\n What is the result of 5 + 7?",
                "A) 10", "B) 12", "C) 14", "D) 16");
        Questions q4 = new Questions("**Programming:**\n Which programming language is known for"
                + " its use in building Android applications?", "A) Java", "B) Python", "C) C++", "D) Ruby");
        Questions q5 = new Questions("**Technology:** What does the acronym \"HTML\" stand for?",
                "A) Hyperlink and Text Markup Language", "B) Hyper Text Markup Language",
                "C) High-Level Text Markup Language", "D) None of these");

        questions.add(q1);
        questions.add(q2);
        questions.add(q3);
        questions.add(q4);
        questions.add(q5);
        //to shuffle questions
        Collections.shuffle(questions);

		 List<Character> answers = new ArrayList<>();
	        answers.add('B');
	        answers.add('A');
	        answers.add('B');
	        answers.add('A');
	        answers.add('B');
	        // Add more answers as needed

	        // Iterate over the questions and answers
	        for (int i = 0; i < questions.size(); i++) {
	            Questions currentQuestion = questions.get(i);
	            char answer = answers.get(i);

	            System.out.println(currentQuestion.getQuestion());
	            System.out.println(currentQuestion.getOpt1());
	            System.out.println(currentQuestion.getOpt2());
	            System.out.println(currentQuestion.getOpt3());
	            System.out.println(currentQuestion.getOpt4());
	            
	            System.out.println("Enter ur answer(A,B,C,D): ");
	            char user=Character.toUpperCase(sc.next().charAt(0));//only 1st char
	            
                if(user=='A'||user=='B'||user=='C'||user=='D') {
                  if(user==answer) {
	            System.out.println("Correct!!");
	            Correctcount++;
	            } 
                else {
	            	System.out.println("Wrong. The correct answer is: " + answer);
	            	Wrongcount++;
	            } }else {
	            	System.out.println("INVALID INPUT..PLEASE ENTER A,B,C or D");
	            	i--;
	            }
                System.out.println();
	        }
	        System.out.println("Ur Quiz is DONE");
	        System.out.println("******************\n\n------RESULT-----");
	        System.out.println("Total Questions: "+questions.size());
	        System.out.println("Correct Answered: "+Correctcount);
	        System.out.println("Wrong Answered: "+Wrongcount++);
	        int per=(100*Correctcount)/questions.size();
	        System.out.println("Percentage: "+per);
	        if(per>90) 
	        	System.out.println("Performance:Well done!!!");
	        else if(per<30)
	        	System.out.println("Performance:Very Poor!");
	        else 
	        	System.out.println("Performance:Good!!");
	}
	 private void printQuizBanner() {
	        System.out.println("********************************************");
	        System.out.println("*                                          *");
	        System.out.println("*          Welcome to the QuizGen!         *");
	        System.out.println("*        Test your knowledge and have fun! *");
	        System.out.println("*                                          *");
	        System.out.println("********************************************");
	        System.out.println("\nINSTRUCTIONS:\r\n" + 
	        		"1. Answer each question by selecting the correct option (A, B, C, or D).\r\n" + 
	        		"2. Make sure to review your answers before proceeding to the next question.\r\n" +
	        		"3. Your score will be calculated based on the number of correct answers.\r\n" + 
	        		"4. After each question, you will receive feedback on your answer.\r\n" + 
	        		"5. Feel free to retry questions if allowed – your final score may improve.\r\n" + 
	        		"6. Thank you for participating! Good luck!\r\n" + 
	        		"\r\n" + 
	        		"[Start Quiz]\r\n" + 
	        		"");
	        System.out.println();
	    }
	
		
	}
