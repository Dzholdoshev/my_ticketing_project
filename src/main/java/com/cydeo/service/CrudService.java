package com.cydeo.service;

import com.cydeo.dto.RoleDTO;
import com.cydeo.dto.UserDTO;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface CrudService <T,ID>{

   T save(T object);
    T findById(ID id);
    List<T> findAll();
    void deleteById(ID id);

   void update(T object);




}
