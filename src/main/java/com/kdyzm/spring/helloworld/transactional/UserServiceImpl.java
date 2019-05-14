package com.kdyzm.spring.helloworld.transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("userService")
public class UserServiceImpl implements IUserService {

    @Autowired
    private OrderLineDao orderLineDao;

    @Override
    @Transactional
    public void insertOrderLine(OrderLine orderLine){
        orderLineDao.insert(orderLine);
        int a = 10/0;
        System.out.println("insertOrderLine execute...");
    }


}