package com.lti.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.entity.User;

@Repository
public class UserRepositoryImpl implements UserRepository {
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	@Transactional
	public void save(User user) {
		entityManager.merge(user);
		
	}
	
	@Override
	public int findByEmailAndPass(String email, String pass) {

		return (Integer) entityManager.createNamedQuery("logincheck").setParameter("em", email).setParameter("pw", pass)
				.getSingleResult();
	}

	@Override
	public boolean isUserAvailable(String email) {
//		return (Long) entityManager.createNamedQuery("count").setParameter("em", email).getSingleResult() == 1 ? true
//				: false;
		System.out.println(entityManager.createQuery("select u.email from User u where u.email = :em")
				.setParameter("em", email).getFirstResult());
		return (Long) entityManager.createQuery("select count(u.id) from User u where u.email = :em")
				.setParameter("em", email).getSingleResult() == 1 ? true : false;
	}

	@Override
	public User findbyId(int id) {
		return entityManager.find(User.class, id);
	}

	
}
