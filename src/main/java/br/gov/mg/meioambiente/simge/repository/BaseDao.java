package br.gov.mg.meioambiente.simge.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import br.gov.mg.meioambiente.simge.entity.BaseModel;


public interface BaseDao<T extends BaseModel> extends JpaRepository<T, Serializable> {

}