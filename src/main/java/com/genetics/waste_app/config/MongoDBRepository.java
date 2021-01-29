package com.genetics.waste_app.config;

import com.mongodb.client.MongoClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.gridfs.GridFsTemplate;

//@Configuration
//public class MongoDBRepository extends AbstractMongoConfiguration {
//
//    @Override
//    public String getDatabaseName() {
//        return "waste_app_db";
//    }
//
//    @Bean
//    public GridFsTemplate gridFsTemplate() throws Exception {
//        return new GridFsTemplate(mongoDbFactory(), mappingMongoConverter());
//    }
//
//    @Bean
//    public MongoTemplate getMongoTemplate() throws Exception {
//        return new MongoTemplate(mongoDbFactory(),mappingMongoConverter());
//    }
//
//    @Override
//    @Bean
//    public MongoClient mongoClient() {
//        return  new MongoClient("127.0.0.1");
//    }
//}