package service;

import dao.BDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BService {
    @Autowired
    BDao bDao;

    public void bService() {
        System.out.println("Service B");
        bDao.b();
    }
}
