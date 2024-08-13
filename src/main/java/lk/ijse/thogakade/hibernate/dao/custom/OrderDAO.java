package lk.ijse.thogakade.hibernate.dao.custom;

import lk.ijse.thogakade.hibernate.dao.SuperDAO;
import lk.ijse.thogakade.hibernate.entity.Item;
import lk.ijse.thogakade.hibernate.entity.Order;

public interface OrderDAO extends SuperDAO {
    boolean save(Order order)throws Exception;
    boolean update(Order order)throws Exception;
    boolean delete(int id)throws Exception;
}
