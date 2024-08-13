package lk.ijse.thogakade.hibernate.bo.custom;

import lk.ijse.thogakade.hibernate.bo.SuperBO;
import lk.ijse.thogakade.hibernate.dto.CustomerDTO;
import lk.ijse.thogakade.hibernate.dto.OrderDTO;

public interface OrderBO extends SuperBO {
    boolean savOrder(OrderDTO dto)throws Exception;
    boolean updateOrder(OrderDTO dto)throws Exception;
    boolean deleteOrder(int id)throws Exception;
}
