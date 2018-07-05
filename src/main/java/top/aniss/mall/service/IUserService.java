package top.aniss.mall.service;

import top.aniss.mall.common.ServerResponse;
import top.aniss.mall.pojo.User;

/**
 * @author Andre Wei
 * create 2018-07-03 下午5:50
 */
public interface IUserService {
    ServerResponse<User> login(String username, String password);

    ServerResponse<String> register(User user);

    ServerResponse<String> checkValid(String str, String type);

    ServerResponse<String> selectQuestion(String username);

    ServerResponse<String> checkAnswer(String username, String question, String answer);

    ServerResponse<String> forgetResetPassword(String username, String passwordNew, String forgetToken);

    ServerResponse<String> resetPassword(User user, String passwordOld, String passwordNew);

    ServerResponse<User> updateInformation(User user);

     ServerResponse<User> getInformation(Integer userId);

    ServerResponse checkAdminRole(User user);
}