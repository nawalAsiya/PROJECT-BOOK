package com.ust.bookstore.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "book_data")
public class book {
	@Id
	private int id;
	
	@Column(name = "title_name", length = 50, nullable = false)
	@NotBlank(message = "Title is required")
	@Size(max = 100, message = "Title should not exceed 100 characters")
	private String title;
	
	@NotBlank(message = "Author name required")
	@Size(max = 200, message = "author should not exceed 200 characters")
	private String author;
	
	@Column(unique = true)
	@Pattern(regexp = "^(\\d{10}||\\d{13})$", message = "The ISBN should be a valid 10- or 13-digit number")
	private String booknum;
	
	@Digits(integer = 4, message = "Publication year must be a valid 4-digit number", fraction = 0)
	private int pubyear;
	
	@Positive(message = "The price should be a positive decimal value.")
	@DecimalMin(value = "0.01", message = "Price must be a positive decimal value")
	private float price;
}
