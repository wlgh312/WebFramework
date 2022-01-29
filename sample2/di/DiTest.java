package sample2.di;

public class DiTest {
	public static void main(String[] args) {
		Exam exam = new NewExam();
		ExamPrint p = new InlineExamPrint(exam);
		p.print();
	}
}
