package com.infcn.gms_api.module.hn_api.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;
import java.util.Map;

@Repository
public class ExecutorDao<T> {


    @Autowired
    private EntityManager em;

    public List<T> queryList(String hql, Map<String ,Object> params){
        Query query = em.createQuery(hql);
        for (String key : params.keySet()) {
            query.setParameter(key, params.get(key));
        }
        return query.getResultList();
    }

    public T getOne(String hql, Map<String, Object> params){
        Query query = em.createQuery(hql);
        for (String key : params.keySet()) {
            query.setParameter(key, params.get(key));
        }
        T result = null;
        try {
            result = (T)query.getSingleResult();
        }catch (Exception e){

        }
        return result;
    }
}
