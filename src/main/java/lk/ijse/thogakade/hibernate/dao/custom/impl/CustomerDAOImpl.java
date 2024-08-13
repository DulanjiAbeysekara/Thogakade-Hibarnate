package lk.ijse.thogakade.hibernate.dao.custom.impl;

import com.mysql.cj.xdevapi.SessionFactory;
import lk.ijse.thogakade.hibernate.config.SessionFactoryConfig;
import lk.ijse.thogakade.hibernate.dao.custom.CustomerDAO;
//import lk.ijse.thogakade.hibernate.dao.custom.impl.util.SQLUtil;
import lk.ijse.thogakade.hibernate.entity.Customer;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CustomerDAOImpl implements CustomerDAO {
    private final Session session = SessionFactoryConfig.getInstance().getSession();

    @Override
    public boolean save(Customer customer) {
        Session session=SessionFactoryConfig.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        session.save(customer);
        transaction.commit();
        session.close();
        return true;

    }
    @Override
    public  boolean update(Customer customer){
        Session session=SessionFactoryConfig.getInstance().getSession();
        Transaction transaction=session.beginTransaction();
        session.update(customer);
        transaction.commit();
        session.close();
        return true;
    }
    @Override
    public  boolean delete(int id){
        Session session=SessionFactoryConfig.getInstance().getSession();
        Transaction transaction=session.beginTransaction();
        session.delete(id);
        transaction.commit();
        session.close();
        return true;
    }


}
