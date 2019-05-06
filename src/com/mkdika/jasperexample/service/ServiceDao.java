
package com.mkdika.jasperexample.service;

import com.mkdika.jasperexample.entity.Test1;
import java.sql.Connection;
import java.util.List;

/**
 *
 * @author Maikel Chandika <mkdika@gmail.com>
 */
public interface ServiceDao {
    
    public boolean save(Object obj);
    public boolean delete(Object obj);
    
    public List<Test1> getTest1All();    
    public boolean deleteTest1All();
    
    public Connection getConn();
}
