package lk.ijse.thogakade.hibernate.bo.custom;

import lk.ijse.thogakade.hibernate.dto.CustomerDTO;
import lk.ijse.thogakade.hibernate.dto.ItemDTO;
import lk.ijse.thogakade.hibernate.entity.Item;

public interface ItemBO {
    boolean saveItem(ItemDTO dto)throws Exception;
    boolean updateItem(ItemDTO dto)throws Exception;
    boolean deleteItem(int id)throws Exception;

}
