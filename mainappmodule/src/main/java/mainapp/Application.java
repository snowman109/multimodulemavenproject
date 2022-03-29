package mainapp;

import com.test.dao.Dao;
import com.test.entity.User;

import java.util.Optional;
import java.util.ServiceLoader;

/**
 * TODO
 *
 * @author wyt
 * @date 2022/3/29 9:59
 */
public class Application {
    public static void main(String[] args) {
        ServiceLoader<Dao> daoIterator = ServiceLoader.load(Dao.class);
        daoIterator.forEach(x -> {
            Optional optionalUser = x.findById(1);
            if (optionalUser.isPresent()) {
                User u = (User) optionalUser.get();
                System.out.println(u.getName());
            }
        });
    }
}
