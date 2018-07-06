package top.aniss.mall.common;



import com.google.common.collect.Sets;

import java.util.Set;

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

    public interface ProductListOrderBy{
        Set<String> PRICE_ASC_DESC = Sets.newHashSet("price_desc", "price_asc");
    }

    public enum ProductStatusEnum {
        ON_SALE(1, "在线"),;
        private String value;
        private int code;

        public String getValue() {
            return value;
        }


        public int getCode() {
            return code;
        }

        ProductStatusEnum(int code, String value) {
            this.value = value;
            this.code = code;
        }
    }
}
