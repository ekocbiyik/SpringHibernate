package com.ekocbiyik.repository.dao;

import com.ekocbiyik.model.Personel;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by enbiya on 22.08.2017.
 */
@Component
public class PersonelDaoImpl implements IPersonelDao {

    @Autowired
    private SessionFactory sessionFactory;

    private Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }

    @Override
    public void save(Personel p) {
        getCurrentSession().save(p);
    }

    @Override
    public void delete(Personel p) {
        getCurrentSession().delete(p);
    }

    @Override
    public List<Personel> getAllPersonels() {
        return getCurrentSession().createQuery("from Personel").list();
    }
}
