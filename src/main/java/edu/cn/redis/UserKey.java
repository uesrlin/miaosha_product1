package edu.cn.redis;

public class UserKey extends BasePrefix {


    public UserKey(String prefix) {
        super(prefix);
    }

    public static UserKey getById = new UserKey("id");
    public static UserKey getByName = new UserKey("name");
    public static UserKey getBymobile = new UserKey("mobile");

}
