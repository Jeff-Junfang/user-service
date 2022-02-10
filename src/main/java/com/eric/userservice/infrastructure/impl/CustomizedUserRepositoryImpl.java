package com.eric.userservice.infrastructure.impl;

import com.eric.userservice.domain.User;
import com.eric.userservice.infrastructure.CustomizedUserRepository;
import com.mongodb.client.result.UpdateResult;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;

/**
 * @Author wangqiang167@midea.com
 * @Date 2022/2/9
 */
@Slf4j
@Repository
@AllArgsConstructor
public class CustomizedUserRepositoryImpl implements CustomizedUserRepository {

    private final MongoTemplate mongoTemplate;

    @Override
    public void updateUserName(Long id, String userName) {
        UpdateResult updateResult = mongoTemplate.updateFirst(
                Query.query(Criteria.where("id").is(id))
                //.addCriteria(Criteria.where("updateTime").lt(updateTime))
                ,
                Update.update("userName", userName),
                User.class);
        log.info("update user name done, result: {}", updateResult);
    }
}
