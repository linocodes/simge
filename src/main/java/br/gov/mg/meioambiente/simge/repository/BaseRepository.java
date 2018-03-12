package br.gov.mg.meioambiente.simge.repository;

import java.io.Serializable;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

import br.gov.mg.meioambiente.simge.entity.BaseModel;

public interface BaseRepository<T extends BaseModel, K extends Serializable> extends PagingAndSortingRepository<T, K>, JpaSpecificationExecutor<T> {

	Page<T> findAll(Pageable pageable);

}