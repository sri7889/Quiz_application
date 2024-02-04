package com.java.quizapp;

public class Questions {
//pojo class
		private String Question;
		private String opt1;
		private String opt2;
		private String opt3;
		private String opt4;
		
		//default constructor
		public Questions() {
			
		}

		public Questions(String question, String opt1, String opt2, String opt3, String opt4) {
			//error
			Question = question;
			this.opt1 = opt1;
			this.opt2 = opt2;
			this.opt3 = opt3;
			this.opt4 = opt4;
		}

		public String getQuestion() {
			return Question;
		}

		public void setQuestion(String question) {
			Question = question;
		}

		public String getOpt1() {
			return opt1;
		}

		public void setOpt1(String opt1) {
			this.opt1 = opt1;
		}

		public String getOpt2() {
			return opt2;
		}

		public void setOpt2(String opt2) {
			this.opt2 = opt2;
		}

		public String getOpt3() {
			return opt3;
		}

		public void setOpt3(String opt3) {
			this.opt3 = opt3;
		}

		public String getOpt4() {
			return opt4;
		}

		public void setOpt4(String opt4) {
			this.opt4 = opt4;
		}

		@Override
		public String toString() {
			return "Questions [Question=" + Question + ", opt1=" + opt1 + ", opt2=" + opt2 + ", opt3=" + opt3
					+ ", opt4=" + opt4 + "]";
		}

}
