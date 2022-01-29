package sample2.di;

public class InlineExamPrint implements ExamPrint {
	private Exam exam;
	
	public InlineExamPrint(Exam exam) {
		this.exam = exam;
	}
	@Override
	public void print() {
		exam.input();
		System.out.printf("sum:%d / svg:%.2f", exam.total(), exam.avg());
	}
}
