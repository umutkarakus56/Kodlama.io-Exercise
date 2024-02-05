package Kodlama.io.business;

import Kodlama.io.entities.Category;
import Kodlama.io.logging.IBaseLogger;
import Kodlama.io.dataAccess.CategoryDao;

public class CategoryManager {
	
	private IBaseLogger[] loggers2;
	
	
	public CategoryManager(CategoryDao categoryDao  ,IBaseLogger[] loggers2) {
	
		this.loggers2 = loggers2;
		
		
	}

    public void add(Category category1) {
    	for(IBaseLogger logger : loggers2) {
    		logger.log(category1.getName());
    	}
    	
    	
    }

}
	
				
		

