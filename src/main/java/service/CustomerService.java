package service;

import helper.DataBaseHelper;
import model.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import util.PropsUtil;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class CustomerService {


    public List<Customer> getCustomerList(String key){
        Connection conn = DataBaseHelper.getConnection();
        try{
            String sql = "select * from customer";
            return DataBaseHelper.queryEntityList(conn,Customer.class,sql);

        }finally {
            DataBaseHelper.closeConnection(conn);
        }

    }

    public Customer getCustomer(long id){
        //TODO
        return null;
    }

    public boolean createCustomer(Map<String, Object> fieldMap){
        //TODO
        return false;
    }

    public boolean updateCustomer(long id, Map<String, Object> fieldMap){
        //TODO
        return false;
    }

    public boolean deleteCustomer(long id){
        //TODO
        return false;
    }
}
