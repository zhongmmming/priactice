package com.shuai.prictice.dao.impl;


import com.shuai.prictice.dao.BookDao;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImpl implements BookDao {

    @Override
    public int save(int i) {
        System.out.println("BookDaoImpl save...."+i);
        return i;
    }

    @Override
    public void update() {
        System.out.println("BookDaoImpl update....");
    }

    @Override
    public void select() {
        System.out.println("BookImpl select");

    }
}
