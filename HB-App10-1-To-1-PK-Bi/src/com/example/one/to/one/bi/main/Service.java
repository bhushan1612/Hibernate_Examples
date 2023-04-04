package com.example.one.to.one.bi.main;

import com.example.one.to.one.bi.bean.Instructor;
import com.example.one.to.one.bi.bean.InstructorDetail;
import com.example.one.to.one.bi.dao.InstructorDao;

public class Service {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Instructor instructor = new Instructor("Ram", "Wagh", "ramwagh010@gmail.com");

		InstructorDetail instructorDetail = new InstructorDetail("http://www.fitnessclub.com", "Sports");
		// associate the objects
		instructorDetail.setInstructor(instructor);
		// associate the objects
		instructor.setInstructorDetail(instructorDetail);
		
		// when you get instructorDetail then hibernate also saves instructor info
		InstructorDao instructorDao = new InstructorDao(); 
		instructorDao.saveInstructor(instructor);
	}

}
