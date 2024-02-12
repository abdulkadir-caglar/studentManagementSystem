package studentManagementSystem.model.exam;

public class ExamScore {
	private Long id;
	private Long studentId;
	private Long courseId;
	private Double score;
	
	public Long getId() {
		return id;
	}
	
	public Long getStudentId() {
		return studentId;
	}
	
	public Long getCourseId() {
		return courseId;
	}
	
	public Double getScore() {
		return score;
	}
	
	public void setScore(Double score) {
		this.score = score;
	}
}
