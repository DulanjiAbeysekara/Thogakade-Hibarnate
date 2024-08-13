package lk.ijse.thogakade.hibernate.dao.custom.impl;

import lk.ijse.thogakade.hibernate.config.SessionFactoryConfig;
import lk.ijse.thogakade.hibernate.dao.custom.OrderDAO;
import lk.ijse.thogakade.hibernate.entity.Item;
import lk.ijse.thogakade.hibernate.entity.Order;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class OrderDAOImpl implements OrderDAO {

    @Override
    public boolean save(Order order) {
        Session session= SessionFactoryConfig.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        session.save(order);
        transaction.commit();
        session.close();
        return true;

    }
    @Override
    public  boolean update(Order order){
        Session session=SessionFactoryConfig.getInstance().getSession();
        Transaction transaction=session.beginTransaction();
        session.update(order);
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
