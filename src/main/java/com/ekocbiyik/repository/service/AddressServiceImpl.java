package com.ekocbiyik.repository.service;

import com.ekocbiyik.model.Address;
import com.ekocbiyik.repository.dao.IAddressDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by enbiya on 23.08.2017.
 */
@Service
public class AddressServiceImpl implements IAddressService {

    @Autowired
    private IAddressDao addressDao;

    @Transactional
    @Override
    public void save(Address a) {
        addressDao.save(a);
    }

    @Transactional
    @Override
    public void delete(Address a) {
        addressDao.delete(a);
    }

    @Transactional
    @Override
    public List<Address> getAllAddresses() {
        return addressDao.getAllAddresses();
    }
}
