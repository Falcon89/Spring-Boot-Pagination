package guru.springframework.configuration;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableAutoConfiguration
@EntityScan(basePackages = {"guru.springframework.entity"})
@EnableJpaRepositories(basePackages = {"guru.springframework.dao"})
@EnableTransactionManagement
public class RepositoryConfiguration {
}
