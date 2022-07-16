package service;

import dao.ADao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AService {
    @Autowired
    ADao aDao;

    public void aService() {
        System.out.println("Service A");
        aDao.a();
    }

}
