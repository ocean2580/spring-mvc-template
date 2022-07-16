package dao.impl;

import dao.ADao;
import org.springframework.stereotype.Repository;

@Repository
public class ADaoImpl implements ADao {
    @Override
    public void a() {
        System.out.println("A");
    }
}
