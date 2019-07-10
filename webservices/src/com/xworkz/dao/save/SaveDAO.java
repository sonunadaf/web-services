package com.xworkz.dao.save;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.entity.save.SaveEntity;

@Repository
public class SaveDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public Integer save(SaveEntity saveEntity) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(saveEntity);
		transaction.commit();
		System.out.println("save ");
		return null;

	}

	public List<SaveEntity> getAll() {

		String sql = "select save from SaveEntity save";
		Session session = sessionFactory.openSession();
		Query query = session.createQuery(sql);
		List list = query.list();
		return list;

	}

	public SaveEntity getById(int id) {
		Session session = sessionFactory.openSession();
		SaveEntity entity = session.get(SaveEntity.class, id);
		System.out.println(entity);
		return entity;

	}

	public int deleteById(int id) {
		String hql = "delete from SaveEntity entity where entity.id=:uid";
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		Query query = session.createQuery(hql);
		query.setParameter("uid", id);
		int deletedId = query.executeUpdate();
		transaction.commit();
		return deletedId;
	}

}
