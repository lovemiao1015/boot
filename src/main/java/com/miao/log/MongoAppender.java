package com.miao.log;


import com.mongodb.BasicDBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import lombok.Data;
import org.apache.log4j.AppenderSkeleton;
import org.apache.log4j.spi.LoggingEvent;
import org.springframework.stereotype.Component;

/**
 * Created by skf
 * Date 2017/11/9.
 */
@Data
public class MongoAppender extends AppenderSkeleton{

    private MongoClient mongoClient;
    private MongoDatabase mongoDatabase;
    private MongoCollection<BasicDBObject> logsCollection;
    private String connectionUrl;
    private String databaseName;
    private String collectionName;

    @Override
    protected void append(LoggingEvent loggingEvent) {

        if(mongoDatabase == null) {
            //mongodb 3.x  需要输入全路劲 mongodb://test:test@106.14.248.249:27017/testdb
            MongoClientURI connectionString = new MongoClientURI(connectionUrl+"/"+databaseName);
            mongoClient = new MongoClient(connectionString);
            mongoDatabase = mongoClient.getDatabase(databaseName);
            logsCollection = mongoDatabase.getCollection(collectionName, BasicDBObject.class);
        }
        logsCollection.insertOne((BasicDBObject) loggingEvent.getMessage());

    }

    @Override
    public void close() {
        if(mongoClient != null) {
            mongoClient.close();
        }
    }

    @Override
    public boolean requiresLayout() {
        return false;
    }
}
