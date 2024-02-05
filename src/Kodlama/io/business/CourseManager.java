package Kodlama.io.business;
import Kodlama.io.entities.Course;
import Kodlama.io.logging.IBaseLogger;
import Kodlama.io.dataAccess.ICourseDao;



public class CourseManager {
	private ICourseDao courseDao;
	private IBaseLogger[] loggers;	
	
	
	public CourseManager(ICourseDao courseDao, 	IBaseLogger[] loggers) {
		this.courseDao = courseDao;
		this.loggers = loggers;
	}

	public void add(Course course) throws Exception {
		if(course.getUnitPrice()<50) {
			throw new Exception("Sepete ekleyecebileceğin ürün 50 TL'den küçük olmamalıdır.");
			
		}	
		courseDao.add(course);
		
		for(IBaseLogger logger : loggers) {
			
			logger.log(course.getName());
					
		}
		
			
	}
	
}	
