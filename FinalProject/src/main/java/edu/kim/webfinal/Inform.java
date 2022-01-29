package edu.kim.webfinal;

public class Inform {
	private int seq;
	private String id;
	private String name;
	private float attendance;
	private float assignment;
	private float project;
	private float midTest;
	private float finalTest;
	private float resScore;
	private String grade;
	private String midPic;
	private String finalPic;
	
	
	public int getSeq() {return seq;}
	public void setSeq(int seq) {this.seq=seq;}
	public String getId() {return id;}
	public void setId(String id) {this.id=id;}
	public String getName() {return name;}
	public void setName(String name) {this.name=name;}
	public float getAttendance() {return attendance;}
	public void setAttendance(float attendance) {this.attendance = attendance;}
	public float getAssignment() {
		return assignment;
	}
	public void setAssignment(float assignment) {
		this.assignment = assignment;
	}
	public float getProject() {
		return project;
	}
	public void setProject(float project) {
		this.project = project;
	}
	public float getMidTest() {
		return midTest;
	}
	public void setMidTest(float midTest) {
		this.midTest = midTest;
	}
	public float getFinalTest() {
		return finalTest;
	}
	public void setFinalTest(float finalTest) {
		this.finalTest = finalTest;
	}
	public float getResScore() {return resScore;}
	public void setResSocre(float resScore) {this.resScore = resScore;}
	public String getMidPic() {
		return midPic;
	}
	public void setMidPic(String midPic) {
		this.midPic = midPic;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getFinalPic() {
		return finalPic;
	}
	public void setFinalPic(String finalPic) {
		this.finalPic = finalPic;
	}
	@Override
	public String toString() {
		return "Inform [seq=" + seq + ", id=" + id + ", name=" + name + ", attendance=" + attendance + ", assignment="
				+ assignment + ", project=" + project + ", midTest=" + midTest + ", finalTest=" + finalTest
				+ ", resScore=" + resScore + ", grade=" + grade + ", midPic=" + midPic + ", finalPic=" + finalPic + "]";
	}
	
}
