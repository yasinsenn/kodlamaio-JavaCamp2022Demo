package kodlamaioDemo.dataAccess;

import kodlamaioDemo.entities.Category;

public class HibernateCategoryDao implements CategoryDao {

	@Override
	public void add(Category category) {
		System.out.println("Hibernate ile veritaban�na eklendi");
		
	}

}