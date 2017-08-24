package com.ekocbiyik.repository.service;

import com.ekocbiyik.model.Address;

import java.util.List;

/**
 * Created by enbiya on 23.08.2017.
 */
public interface IAddressService {

    void save(Address a);

    void delete(Address a);

    List<Address> getAllAddresses();

}
