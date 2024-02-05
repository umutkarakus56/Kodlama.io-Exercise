package Kodlama.io.dataAccess;

import Kodlama.io.entities.Category;
import Kodlama.io.entities.Course;
import Kodlama.io.entities.Instructor;
public class CategoryDao implements ICourseDao  {
	

	public void add(Category category) {
		String category1 = "'İş sağlayan kurslar'";
		System.out.println( category1 + " adlı kategori eklenmiştir." );
	}

	
	public void add(Course course) {
		
		
	}

	
	public void add(Instructor instructor) {
		
		
	}

}
