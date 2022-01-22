package api.mysql.entity;
import api.mysql.controller.*;
import api.mysql.repo.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

// Таблица ингредиентов

@Entity
public class Ingredient {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private long dish;
	
	private long product;
	
	private int productAmountInDish; // кол-во для приготовления
	
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getDish() {
		return dish;
	}

	public void setDish(long dish) {
		this.dish = dish;
	}

	public long getProduct() {
		return product;
	}

	public void setProduct(long product) {
		this.product = product;
	}

	public int getProductAmountInDish() {
		return productAmountInDish;
	}

	public void setProductAmountInDish(int productAmountInDish) {
		this.productAmountInDish = productAmountInDish;
	}

	
	
	
}
