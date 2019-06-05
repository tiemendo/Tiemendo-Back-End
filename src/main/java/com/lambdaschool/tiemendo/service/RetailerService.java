package com.lambdaschool.tiemendo.service;

import com.lambdaschool.tiemendo.model.Retailer;

import java.util.List;

public interface RetailerService
{

    List<Retailer> findAll();
    
    List<Retailer> searchRetailer(String name, String location, boolean lead);
    
    Retailer findRetailerById(long id);

    Retailer save(Retailer newRetailer);
    
    Retailer update(long id, Retailer update);
    
    void delete(long id);
}
