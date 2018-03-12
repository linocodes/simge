package br.gov.mg.meioambiente.simge.controller;

import com.google.common.base.Throwables;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import br.gov.mg.meioambiente.simge.dao.GenericDao;
import br.gov.mg.meioambiente.simge.entity.BaseModel;
import br.gov.mg.meioambiente.simge.repository.BaseRepository;
import br.gov.mg.meioambiente.simge.service.CRUDService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.repository.CrudRepository;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.List;
import java.util.Map;


public abstract class RESTController<T extends BaseModel, ID extends Serializable> {

    private Logger logger = LoggerFactory.getLogger(RESTController.class);

    private GenericDao<T, ID> repo;
    
    public RESTController(GenericDao<T, ID> repo) {
        this.repo = repo;
    }

    @RequestMapping
    public @ResponseBody List<T> listAll() {
        Iterable<T> all = this.repo.getAll();
        return Lists.newArrayList(all);
    }

    @RequestMapping(method=RequestMethod.POST, consumes={MediaType.APPLICATION_JSON_VALUE})
    public @ResponseBody Map<String, Object> create(@RequestBody T json) {
        logger.debug("create() with body {} of type {}", json, json.getClass());

        this.repo.add(json);

        Map<String, Object> m = Maps.newHashMap();
        return m;
    }

    @RequestMapping(value="/{id}", method=RequestMethod.GET)
    public @ResponseBody T get(@PathVariable ID id) {
        return this.repo.find(id);
    }

    @RequestMapping(value="/{id}", method=RequestMethod.POST, consumes={MediaType.APPLICATION_JSON_VALUE})
    public @ResponseBody Map<String, Object> update(@PathVariable ID id, @RequestBody T json) {
        logger.debug("update() of id#{} with body {}", id, json);
        logger.debug("T json is of type {}", json.getClass());

        T entity = this.repo.find(id);
        try {
            //BeanUtils.copyProperties(entity, json);
        }
        catch (Exception e) {
            logger.warn("while copying properties", e);
            throw Throwables.propagate(e);
        }

        logger.debug("merged entity: {}", entity);

        this.repo.saveOrUpdate(entity);
        //logger.debug("updated enitity: {}", updated);

        Map<String, Object> m = Maps.newHashMap();
        m.put("success", true);
        m.put("id", id);
       // m.put("updated", updated);
        return m;
    }

    @RequestMapping(value="/{id}", method=RequestMethod.DELETE)
    public @ResponseBody Map<String, Object> delete(@PathVariable ID id) {
       // this.repo.remove(id);
        Map<String, Object> m = Maps.newHashMap();
        m.put("success", true);
        return m;
    }
}