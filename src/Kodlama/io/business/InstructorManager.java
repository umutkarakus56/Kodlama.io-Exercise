package Kodlama.io.business;

import Kodlama.io.entities.Instructor;
import Kodlama.io.logging.IBaseLogger;
import Kodlama.io.dataAccess.InstructorDao;
public class InstructorManager {
	
	private IBaseLogger[] loggers3;

	
	public InstructorManager(InstructorDao instructorDao,IBaseLogger[] loggers3) {
		
		this.loggers3 = loggers3;

		
	}
	
public void add(Instructor instructor) {
	for(IBaseLogger logger : loggers3) {
		logger.log(instructor.getName());
	}
		
	InstructorDao instructorDao = new InstructorDao();
	instructorDao.add(instructor);
	
		
	}
}
