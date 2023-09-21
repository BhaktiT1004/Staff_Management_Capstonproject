package com.admin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.admin.model.Login;



@Repository
public interface LoginRepository extends JpaRepository<Login,String>
{

}