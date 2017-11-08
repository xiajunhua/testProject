package xxx.web.test.service;

import java.util.List;

import xxx.web.test.bean.Teacher;
import xxx.web.test.dao.TeacherDAO;

public class TeacherService {

	private TeacherDAO teacherDAO;
	
	public TeacherDAO getTeacherDAO() {
		return teacherDAO;
	}

	public void setTeacherDAO(TeacherDAO teacherDAO) {
		this.teacherDAO = teacherDAO;
	}

	public List<Teacher> getStudentList(){
		return this.teacherDAO.getStudentList();
	}
}
