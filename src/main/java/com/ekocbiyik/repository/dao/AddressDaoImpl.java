package com.ekocbiyik.repository.dao;

import com.ekocbiyik.model.Address;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by enbiya on 23.08.2017.
 */
@Component
public class AddressDaoImpl implements IAddressDao {

    @Autowired
    private SessionFactory sessionFactory;

    private Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }

    @Override
    public void save(Address a) {
        getCurrentSession().save(a);
    }

    @Override
    public void delete(Address a) {
        getCurrentSession().delete(a);
    }

    @Override
    public List<Address> getAllAddresses() {
        return getCurrentSession().createQuery("from Address").list();
    }
}
