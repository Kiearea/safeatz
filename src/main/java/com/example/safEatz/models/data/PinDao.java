package com.example.safEatz.models.data;

import com.example.safEatz.models.Pin;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface PinDao extends CrudRepository<Pin, Integer> {

}
