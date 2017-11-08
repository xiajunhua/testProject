package xxx.web.test.service;

import java.util.List;

import xxx.web.test.bean.Student;
import xxx.web.test.dao.StudentDAO;

public class StudentService {
	private StudentDAO studentDAO;
	
	public StudentDAO getStudentDAO() {
		return studentDAO;
	}
	public void setStudentDAO(StudentDAO studentDAO) {
		this.studentDAO = studentDAO;
	}


	public List<Student> getStudentList(){
		return this.studentDAO.getStudentList();
	}
}
