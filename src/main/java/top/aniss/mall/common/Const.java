package top.aniss.mall.common;

/**
 * @author Andre Wei
 * create 2018-07-03 下午7:31
 */
public class Const {
    public static final String CURRENT_USER = "current_user";
    public static final String EMAIL = "email";
    public static final String USERNAME = "username";


    public interface Role {
        int ROLE_CUSTOMER = 0;
        int ROLE_ADMIN = 1;
    }
}
