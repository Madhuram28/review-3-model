package com.example.SpringRestApi.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SpringRestApi.Model.Address;

public interface AddressRepository extends JpaRepository <Address,Long>{

}
