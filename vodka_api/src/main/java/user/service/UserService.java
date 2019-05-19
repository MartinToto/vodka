package user.service;


import java.util.List;

/**
 * Created by Martin on 2019/5/19.
 */
public interface UserService {
    List<User> listAllUser();

    Integer saveUser(User user);

    Integer countUser();
}
