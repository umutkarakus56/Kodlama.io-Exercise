package Kodlama.io.dataAccess;

import Kodlama.io.entities.Course;
import Kodlama.io.entities.Category;
import Kodlama.io.entities.Instructor;

public interface ICourseDao {
	 void add(Course course);
	 void add(Category category);
	 void add(Instructor instructor);
}