package lk.ijse.thogakade.hibernate.bo.custom.impl;

import lk.ijse.thogakade.hibernate.bo.custom.CustomerBO;
import lk.ijse.thogakade.hibernate.dao.custom.CustomerDAO;
import lk.ijse.thogakade.hibernate.dao.custom.impl.CustomerDAOImpl;
import lk.ijse.thogakade.hibernate.dto.CustomerDTO;
import lk.ijse.thogakade.hibernate.entity.Customer;

public class CustomerBOImpl implements CustomerBO {
    CustomerDAO customerDAO=new CustomerDAOImpl();

    @Override
    public boolean saveCustomer(CustomerDTO dto)throws Exception{
      return customerDAO.save(new Customer(
            dto.getId(),
            dto.getName(),
            dto.getMobileNumber()
      ));
    }
    @Override
    public  boolean updateCustomer(CustomerDTO dto)throws Exception{
        return customerDAO.update(new Customer(
                dto.getId(),
                dto.getName(),
                dto.getMobileNumber()
        ));
    }
    @Override
    public boolean deleteCustomer(int id)throws Exception{

        return customerDAO.delete(id);
    }

}
