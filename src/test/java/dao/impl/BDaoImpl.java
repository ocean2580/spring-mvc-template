package dao.impl;

import dao.BDao;
import org.springframework.stereotype.Repository;

@Repository
public class BDaoImpl implements BDao {
    @Override
    public void b() {
        System.out.println("B");
    }
}
