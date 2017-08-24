package com.ekocbiyik.repository.service;

import com.ekocbiyik.model.Personel;
import com.ekocbiyik.repository.dao.IPersonelDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by enbiya on 22.08.2017.
 */
@Service
public class PersonelServiceImpl implements IPersonelService {

    @Autowired
    private IPersonelDao personelDao;


    @Transactional
    @Override
    public void save(Personel p) {
        personelDao.save(p);
    }

    @Transactional
    @Override
    public void delete(Personel p) {
        personelDao.delete(p);
    }

    @Transactional
    @Override
    public List<Personel> getAllPersonels() {
        return personelDao.getAllPersonels();
    }
}
