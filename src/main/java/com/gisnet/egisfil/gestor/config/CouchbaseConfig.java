
package com.gisnet.egisfil.gestor.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.couchbase.config.AbstractCouchbaseConfiguration;
import org.springframework.data.couchbase.repository.config.EnableCouchbaseRepositories;


@Configuration
@EnableCouchbaseRepositories
public class CouchbaseConfig extends AbstractCouchbaseConfiguration {
    
    @Override
    public String getConnectionString(){
        return "couchbase://localhost";
    }
    
    @Override
    public String getUserName(){
        return "Administrator";
    }
    
    @Override
    public String getPassword(){
        return "g15n3t21";
    }

    @Override
    public String getBucketName() {
       return "e-gisfil-conf";
    }
    
    
    
}