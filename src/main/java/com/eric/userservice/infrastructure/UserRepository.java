package com.eric.userservice.infrastructure;

import com.eric.userservice.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * 继承 MongoRepository 自动实现基础增删查功能
 * 继承 CustomizedUserRepository 实现自定义接口(如update)
 *
 * @Author wangqiang167@midea.com
 * @Date 2022/2/9
 */
public interface UserRepository extends MongoRepository<User, Long>, CustomizedUserRepository {

}
