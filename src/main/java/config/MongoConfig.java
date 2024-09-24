package config;


import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.sql.Connection;

@Configuration
@EnableMongoRepositories(basePackages = "br.com.mchaves.repository")
public class MongoConfig {

    @Bean
    public MongoClient mongo() throws Exception{
        final ConnectionString connectionString = new ConnectionString("mongodb://127.0.0.1:27017/MateusDados?authSource=admin");
        final MongoClientSettings mongoClientSettings = MongoClientSettings.builder().applyConnectionString(connectionString).build();
        return MongoClients.create(mongoClientSettings);

    }

    @Bean
    public MongoTemplate mongoTemplate() throws Exception{
        return  new MongoTemplate(mongo(), "MateusDados");
    }


}
