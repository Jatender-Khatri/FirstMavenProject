package com.daoImpl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.connection.Connections;
import com.dao.CategoryEntityDao;
import com.entity.CategoryEntity;

public class CategoryEntityDaoImpl implements CategoryEntityDao {
	static SessionFactory factory = Connections.getConnection();

	public Integer addCategory(CategoryEntity category) {
		Integer roll = null;
		try {
			Session session = factory.openSession();
			Transaction transaction = (Transaction) session.beginTransaction();

			session.save(category);
			transaction.commit();
			session.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return roll;
	}

	public List<CategoryEntity> getCategorys() {
		List<CategoryEntity> list = new ArrayList<CategoryEntity>();
		try {

			Session session = factory.openSession();
			Transaction transaction = (Transaction) session.beginTransaction();

			list = session.createQuery("From CategoryEntity").list();
			transaction.commit();
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	public Integer deleteCategory(CategoryEntity category) {
		Integer roll = null;
		try {

			Session session = factory.openSession();
			Transaction transaction = (Transaction) session.beginTransaction();

			session.remove(category);
			transaction.commit();
			session.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return roll;
	}

	
	public CategoryEntity getCategoryById(int id) {
		CategoryEntity a = null;
		try {

			Session session = factory.openSession();
			Transaction transaction = (Transaction) session.beginTransaction();

			a = session.get(CategoryEntity.class, id);

			transaction.commit();
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return a;
	}

	
	public Integer updateCategory(CategoryEntity category) {
		Integer roll = null;
		try {

			Session session = factory.openSession();
			Transaction transaction = (Transaction) session.beginTransaction();

			session.update(category);
			transaction.commit();
			session.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return roll;
	}

	
	public CategoryEntity getCategoryByName(String name) {
		CategoryEntity author = null;
		try {

			Session session = factory.openSession();

			Transaction transaction = (Transaction) session.beginTransaction();
			Query query = session.createQuery("From CategoryEntity a where a.name=:n");
			query.setParameter("n", name);
			author = (CategoryEntity) query.getSingleResult();

			transaction.commit();
			System.out.println("Successfully fetched.");
			// factory.close();
			session.close();

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Error : " + e.getMessage());
		}
		return author;
	}

}
