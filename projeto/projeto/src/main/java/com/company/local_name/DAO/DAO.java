package com.company.local_name.DAO;

import java.util.List;
import java.sql.SQLException;

public interface DAO<T> {

    public void create(T t) throws SQLException;
    public T read(Integer id) throws SQLException;
    public void update(T t) throws SQLException;
    public void delete(Integer id) throws SQLException;
    public List<T> all() throws SQLException;  
    
}
