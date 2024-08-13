package lk.ijse.thogakade.hibernate.bo.custom.impl;

import lk.ijse.thogakade.hibernate.bo.custom.OrderBO;
import lk.ijse.thogakade.hibernate.dao.custom.CustomerDAO;
import lk.ijse.thogakade.hibernate.dao.custom.OrderDAO;
import lk.ijse.thogakade.hibernate.dao.custom.impl.CustomerDAOImpl;
import lk.ijse.thogakade.hibernate.dao.custom.impl.OrderDAOImpl;
import lk.ijse.thogakade.hibernate.dto.CustomerDTO;
import lk.ijse.thogakade.hibernate.dto.ItemDTO;
import lk.ijse.thogakade.hibernate.dto.OrderDTO;
import lk.ijse.thogakade.hibernate.entity.Customer;
import lk.ijse.thogakade.hibernate.entity.Order;

public class OrderBOImpl implements OrderBO {
    OrderDAO orderDAO=new OrderDAOImpl();

    @Override
    public boolean savOrder(OrderDTO dto)throws Exception{
        return orderDAO.save(new Order(
                dto.getId(),
                dto.getCustomerId(),
                dto.getDescription(),
                dto.getQty()
        ));
    }
    @Override
    public  boolean updateOrder(OrderDTO dto)throws Exception{
        return orderDAO.update(new Order(
                dto.getId(),
                dto.getCustomerId(),
                dto.getDescription(),
                dto.getQty()
        ));
    }
    @Override
    public boolean deleteOrder(int id)throws Exception{

        return orderDAO.delete(id);
    }

}
