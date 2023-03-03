package org.tnsif.service;

import org.tnsif.dao.StudentDao;
import org.tnsif.dao.StudentDaoImpl;
import org.tnsif.entities.Student;

public class StudentServiceImpl  implements StudentService{
private StudentDaoImpl dao;
	

	@Override
	public void add(Student student) {
	dao.beginTransaction();
	dao.addStudent(student);
	dao.commitTransaction();
	
}

	@Override
	public void update(Student student) {
	dao.beginTransaction();
	dao.updateStudent(student);
	dao.commitTransaction();
	
}

	@Override
	public void delete(Student student) {
	dao.beginTransaction();
	dao.removeStudent(student);
	dao.commitTransaction();
	
}

	@Override
	public Student get(int rollno) {
	
	Student student=dao.getStudent(rollno);
	return student;
	
	
}

}
