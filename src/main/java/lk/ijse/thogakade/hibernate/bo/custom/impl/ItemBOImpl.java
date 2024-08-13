package lk.ijse.thogakade.hibernate.bo.custom.impl;

import lk.ijse.thogakade.hibernate.bo.custom.ItemBO;
import lk.ijse.thogakade.hibernate.dao.custom.ItemDAO;
import lk.ijse.thogakade.hibernate.dao.custom.impl.ItemDAOImpl;
import lk.ijse.thogakade.hibernate.dto.CustomerDTO;
import lk.ijse.thogakade.hibernate.dto.ItemDTO;
import lk.ijse.thogakade.hibernate.entity.Customer;
import lk.ijse.thogakade.hibernate.entity.Item;

public class ItemBOImpl implements ItemBO {

    ItemDAO itemDAO=new ItemDAOImpl();

    @Override
    public boolean saveItem(ItemDTO dto)throws Exception{
        return itemDAO.save(new Item(
                dto.getId(),
                dto.getName(),
                dto.getPrice(),
                dto.getQty()
        ));
    }
    @Override
    public  boolean updateItem(ItemDTO dto)throws Exception{
        return itemDAO.update(new Item(
                dto.getId(),
                dto.getName(),
                dto.getPrice(),
                dto.getQty()
        ));
    }
    @Override
    public boolean deleteItem(int id)throws Exception{

        return itemDAO.delete(id);
    }
}
