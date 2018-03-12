package br.gov.mg.meioambiente.simge.dao;

import java.io.Serializable;
import java.util.List;

import br.gov.mg.meioambiente.simge.entity.BaseModel;
import br.gov.mg.meioambiente.simge.repository.BaseRepository;

public class GenericDaoImpl<T extends BaseModel, K extends Serializable> implements GenericDao<T, K> {

	private BaseRepository<T, K> repository;

	public GenericDaoImpl(BaseRepository<T, K> repository) {
		this.repository = repository;
	}

	@Override
	public void add(T entity) {
		repository.save(entity);
	}

	@Override
	public void saveOrUpdate(T entity) {
		repository.save(entity);
	}

	@Override
	public void update(T entity) {
		repository.save(entity);
	}

	@Override
	public void remove(T entity) {
		repository.delete(entity);
	}

	@Override
	public List<T> getAll() {
		return (List<T>) repository.findAll();
	}

	@Override
	public T find(K key) {
		return repository.findOne(key);
	}
	
}