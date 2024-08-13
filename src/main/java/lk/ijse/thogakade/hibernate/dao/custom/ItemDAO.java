package lk.ijse.thogakade.hibernate.dao.custom;

import lk.ijse.thogakade.hibernate.dao.SuperDAO;
import lk.ijse.thogakade.hibernate.entity.Customer;
import lk.ijse.thogakade.hibernate.entity.Item;

public interface ItemDAO extends SuperDAO {
    boolean save(Item item)throws Exception;
    boolean update(Item item)throws Exception;
    boolean delete(int id)throws Exception;
}
