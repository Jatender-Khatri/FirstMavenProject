package com.dao;

import java.util.List;

import com.entity.CategoryEntity;

public interface CategoryEntityDao {
	public Integer addCategory(CategoryEntity category);

	public List<CategoryEntity> getCategorys();

	public Integer deleteCategory(CategoryEntity category);

	public CategoryEntity getCategoryById(int id);

	public Integer updateCategory(CategoryEntity category);

	public CategoryEntity getCategoryByName(String name);
}
