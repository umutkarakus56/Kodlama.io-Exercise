package Kodlama.io.dataAccess;

import Kodlama.io.entities.Category;
import Kodlama.io.entities.Course;
import Kodlama.io.entities.Instructor;

public class InstructorDao implements ICourseDao  {
			
	public void add(Instructor instructor) {
		String instructor1 = "'Engin Demiroğ'";
		System.out.println( instructor1 + " adlı eğitmen eklenmiştir." );
	}


	public void add(Course course) {
			
		
	}

	
	public void add(Category category) {
		// TODO Auto-generated method stub
		
	}



}
