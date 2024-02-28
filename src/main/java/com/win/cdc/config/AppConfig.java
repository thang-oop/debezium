package com.win.cdc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

//    @Bean
//    public io.debezium.config.Configuration customerConnector() {
//        return io.debezium.config.Configuration.create()
//                .with("name", "customer-mysql-connector")
//                .with("connector.class", "io.debezium.connector.mysql.MySqlConnector")
//                .with("offset.storage", "org.apache.kafka.connect.storage.FileOffsetBackingStore")
//                .with("offset.storage.file.filename", "/tmp/offsets.dat")
//                .with("offset.flush.interval.ms", "60000")
//                .with("database.server.name", "customer-mysql-db-server")
//                .with("database.include.list", "debezium")
//                .with("database.hostname", "localhost")
//                .with("database.port", 3305)
//                .with("database.user", "root")
//                .with("database.password", "root")
//                .with("database.dbname", "debezium")
//                .with("include.schema.changes", "false")
//                .with("database.allowPublicKeyRetrieval","true")
//                .with("database.server.id", "10181")
//                .with("database.history", "io.debezium.relational.history.FileDatabaseHistory")
//                .with("database.history.file.filename", "/tmp/dbhistory.dat")
//                .build();
//    }

    @Bean
    public io.debezium.config.Configuration customerConnector() {
        return io.debezium.config.Configuration.create()
                .with("name", "customer-oracle-connector")
                .with("connector.class", "io.debezium.connector.oracle.OracleConnector")
                .with("offset.storage", "org.apache.kafka.connect.storage.FileOffsetBackingStore")
                .with("offset.storage.file.filename", "/tmp/offsets.dat")
                .with("offset.flush.interval.ms", "60000")
                .with("database.server.name", "customer-oracle-db-server")
                .with("database.hostname", "10.0.152.88")
                .with("database.port", 1521)
                .with("database.user", "CARDAPP")
                .with("database.password", "CARDAPP123")
                .with("database.dbname", "svfe")
                .with("database.server.id", "10181")
                .with("database.history", "io.debezium.relational.history.FileDatabaseHistory")
                .with("database.history.file.filename", "/tmp/dbhistory.dat")
                .with("table.whitelist", "SVISTA.TBL_LOG_ERR")
                .with("topic.prefix", "topic")
                .with("database.out.server.name", "dbzxout")
                .with("include.schema.changes", "false")
                .build();
    }
}
