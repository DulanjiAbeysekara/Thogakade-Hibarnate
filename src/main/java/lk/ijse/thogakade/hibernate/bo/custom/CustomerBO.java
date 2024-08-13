package lk.ijse.thogakade.hibernate.bo.custom;

import lk.ijse.thogakade.hibernate.bo.SuperBO;
import lk.ijse.thogakade.hibernate.dto.CustomerDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public interface CustomerBO extends SuperBO {
    boolean saveCustomer(CustomerDTO dto)throws Exception;
    boolean updateCustomer(CustomerDTO dto)throws Exception;
    boolean deleteCustomer(int id)throws Exception;

}
