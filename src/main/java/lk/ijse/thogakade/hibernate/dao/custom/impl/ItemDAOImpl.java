package lk.ijse.thogakade.hibernate.dao.custom.impl;

import lk.ijse.thogakade.hibernate.config.SessionFactoryConfig;
import lk.ijse.thogakade.hibernate.dao.custom.ItemDAO;
import lk.ijse.thogakade.hibernate.entity.Customer;
import lk.ijse.thogakade.hibernate.entity.Item;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class ItemDAOImpl implements ItemDAO {

    @Override
    public boolean save(Item item) {
        Session session=SessionFactoryConfig.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        session.save(item);
        transaction.commit();
        session.close();
        return true;

    }
    @Override
    public  boolean update(Item item){
        Session session=SessionFactoryConfig.getInstance().getSession();
        Transaction transaction=session.beginTransaction();
        session.update(item);
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
