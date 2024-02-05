package Kodlama.io;

import Kodlama.io.entities.Course;
import Kodlama.io.business.CategoryManager;
import Kodlama.io.logging.IBaseLogger;
import Kodlama.io.logging.MailLogger;
import Kodlama.io.entities.Category;
import Kodlama.io.entities.Instructor;
import Kodlama.io.logging.DatabaseLogger;
import Kodlama.io.logging.FileLogger;
import Kodlama.io.business.*;
import Kodlama.io.dataAccess.CategoryDao;
import Kodlama.io.dataAccess.HibernateCourseDao;
import Kodlama.io.dataAccess.InstructorDao;

public class Main {
	public static void main(String[] args) throws Exception {
		
		IBaseLogger[] loggers = {new DatabaseLogger() , new FileLogger(), new MailLogger()};
		IBaseLogger[] loggers2 = {new DatabaseLogger() , new FileLogger(), new MailLogger()};

		Course course1 = new Course(10,"Baristalık kursu",150);
		
		CourseManager courseManager = new CourseManager(new HibernateCourseDao(),loggers);
		courseManager.add(course1);
		
		Category category1 = new Category(1,"İş sağlayan kurslar");
		
		CategoryManager categoryManager = new CategoryManager(new CategoryDao(),loggers2);
		categoryManager.add(category1);
		
		Instructor instructor1 = new Instructor(11,"Engin Demiroğ");
		
		
		InstructorManager instructorManager = new InstructorManager(new InstructorDao(), loggers2);
		instructorManager.add(instructor1);
		
		
		
	}
}	
