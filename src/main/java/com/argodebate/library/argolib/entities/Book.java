package com.argodebate.library.argolib.entities;

import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "books")
public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "title")
	private String title;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "isbn")
	private String category;
	
	@Column(name = "page_count")
	private Long pageCount;
	
	@Column(name = "author")
	private String author;
	
	@Column(name = "date_published")
	private Date datePublished;
	
	@OneToMany(mappedBy = "book", cascade = CascadeType.ALL)
	private List<Reservation> reservations;
	
	@OneToMany(mappedBy = "book", cascade = CascadeType.ALL)
	private List<Review> reviews;
	
	public Book() {
		
	}

	public Book(Long id, String title, String description, String category, Long pageCount, String author,
			Date datePublished, List<Reservation> reservations, List<Review> reviews) {
		this.id = id;
		this.title = title;
		this.description = description;
		this.category = category;
		this.pageCount = pageCount;
		this.author = author;
		this.datePublished = datePublished;
		this.reservations = reservations;
		this.reviews = reviews;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Long getPageCount() {
		return pageCount;
	}

	public void setPageCount(Long pageCount) {
		this.pageCount = pageCount;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Date getDatePublished() {
		return datePublished;
	}

	public void setDatePublished(Date datePublished) {
		this.datePublished = datePublished;
	}

	public List<Reservation> getReservations() {
		return reservations;
	}

	public void setReservations(List<Reservation> reservations) {
		this.reservations = reservations;
	}

	public List<Review> getReviews() {
		return reviews;
	}

	public void setReviews(List<Review> reviews) {
		this.reviews = reviews;
	}
}
