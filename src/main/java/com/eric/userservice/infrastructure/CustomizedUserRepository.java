package com.eric.userservice.infrastructure;

/**
 * 自定义接口,例如mongo数据更新,通过 MongoTemplate 实现
 *
 * @Author wangqiang167@midea.com
 * @Date 2022/2/9
 */
public interface CustomizedUserRepository {

    /**
     * update user name
     *
     * @param id
     * @param userName
     */
    void updateUserName(Long id, String userName);
}
