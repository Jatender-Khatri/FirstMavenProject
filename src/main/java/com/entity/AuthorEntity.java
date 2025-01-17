package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="author")
public class AuthorEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="author_id")
	private Integer authorId;
	@Column(name="author_name")
	private String authorName;
	@Column(name="no_of_publication")
	private Integer noOfPublication;
	/**
	 * @return the authorId
	 */
	public Integer getAuthorId() {
		return authorId;
	}
	/**
	 * @param authorId the authorId to set
	 */
	public void setAuthorId(Integer authorId) {
		this.authorId = authorId;
	}
	/**
	 * @return the authorName
	 */
	public String getAuthorName() {
		return authorName;
	}
	/**
	 * @param authorName the authorName to set
	 */
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	/**
	 * @return the noOfPublication
	 */
	public Integer getNoOfPublication() {
		return noOfPublication;
	}
	/**
	 * @param noOfPublication the noOfPublication to set
	 */
	public void setNoOfPublication(Integer noOfPublication) {
		this.noOfPublication = noOfPublication;
	}
}
