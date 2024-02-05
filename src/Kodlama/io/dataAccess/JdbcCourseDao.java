package Kodlama.io.dataAccess;

import Kodlama.io.entities.Category;
import Kodlama.io.entities.Course;
import Kodlama.io.entities.Instructor;

public class JdbcCourseDao implements ICourseDao {
	public void add(Course course) {
		String course1 = "Baristalık kursu";
		System.out.println("JDBC ile " + course1 + " veritabanına eklendi.");
	}

	public void add(Category category) {
			
		
	}

	public void add(Instructor instructor) {
			
		
	}
}
