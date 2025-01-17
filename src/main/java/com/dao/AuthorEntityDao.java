package com.dao;

import java.util.List;

import com.entity.AuthorEntity;

public interface AuthorEntityDao {
	public Integer addAuthor(AuthorEntity author);

	public List<AuthorEntity> getAuthors();

	public Integer deleteAuthor(AuthorEntity author);

	public AuthorEntity getAuthorById(int id);

	public Integer updateAuthor(AuthorEntity author);

	public AuthorEntity getAuthorByName(String name);
}
