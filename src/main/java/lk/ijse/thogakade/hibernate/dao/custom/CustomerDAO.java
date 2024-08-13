package lk.ijse.thogakade.hibernate.dao.custom;

//import lk.ijse.thogakade.hibernate.dao.CrudDAO;
import lk.ijse.thogakade.hibernate.dao.SuperDAO;
import lk.ijse.thogakade.hibernate.entity.Customer;

public interface CustomerDAO extends SuperDAO {
    boolean save(Customer customer)throws Exception;
    boolean update(Customer customer)throws Exception;
    boolean delete(int id)throws Exception;
}
