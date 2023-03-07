package ru.mgt.mailingService.group.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.mgt.icp.shared.kafka.store.StoreProperties;
import ru.mgt.icp.shared.kafka.store.Stores;
import ru.mgt.icp.shared.kafka.store.group.TabGroupStore;
import ru.mgt.icp.shared.kafka.store.user.UserStore;

@Configuration
public class GroupStoreConfig {
//    @Value("${spring.application.name}")
    String applicationName = "mewapplicationtest";

    @Value("${spring.kafka.bootstrap-servers}")
    String bootstrap;

    @Value("${spring.kafka.properties.schema.registry.url}")
    String schema;

    @Value("${general.kafka.topics.tab-groups.name}")
    String topic;

    @Bean
    public TabGroupStore tabGroupStore() {
        return Stores.tabGroup(StoreProperties.topic(topic)
                .withApplicationId(applicationName)
                .withBootstrapServer(bootstrap)
                .withSchemaRegistryUrl(schema)
                .inMemory()
        );
    }

    @Bean
    public UserStore userStore() {
        return Stores.user(StoreProperties.topic(topic)
                .withApplicationId(applicationName)
                .withBootstrapServer(bootstrap)
                .withSchemaRegistryUrl(schema)
                .inMemory()
        );
    }

}
