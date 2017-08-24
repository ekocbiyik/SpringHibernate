package com.ekocbiyik.repository.dao;

import com.ekocbiyik.model.Personel;

import java.util.List;

/**
 * Created by enbiya on 22.08.2017.
 */
public interface IPersonelDao {

    void save(Personel p);

    void delete(Personel p);

    List<Personel> getAllPersonels();

}
