package com.ekocbiyik.repository.service;

import com.ekocbiyik.model.Personel;

import java.util.List;

/**
 * Created by enbiya on 22.08.2017.
 */
public interface IPersonelService {

    void save(Personel p);

    void delete(Personel p);

    List<Personel> getAllPersonels();

}
