package api.mysql;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//Таблица блюд

@Entity
public class Dishes {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String name; // название
	
	private String recipe; // рецепт
	
	private java.sql.Time cookTime; // время приготовления
	
	private short numOfPeople; // на сколько человек расчитано

	
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRecipe() {
		return recipe;
	}
	
	public void setRecipe(String recipe) {
		this.recipe = recipe;
	}
	
	public java.sql.Time getCookTime() {
		return cookTime;
	}

	public void setCookTime(java.sql.Time cookTime) {
		this.cookTime = cookTime;
	}

	public short getNumOfPeople() {
		return numOfPeople;
	}

	public void setNumOfPeople(short numOfPeople) {
		this.numOfPeople = numOfPeople;
	}
	
}
