package autowired.dao;

import org.springframework.stereotype.Repository;

@Repository
public class userDaoImpl implements userDao {
    @Override
    public void addDao() {
        System.out.println("userDaoImpl.....");
    }
}
