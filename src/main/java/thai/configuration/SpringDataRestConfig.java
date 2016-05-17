package thai.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;

/**
 * Created by thaitran on 5/16/16.
 */
@Configuration
class SpringDataRestConfig {
    @Bean
    public RepositoryRestConfigurer repositoryRestConfigurer() {
        return new RepositoryRestConfigurerAdapter() {
            @Override
            public void configureRepositoryRestConfiguration(
                    RepositoryRestConfiguration config) {
                // Expose id attribute over the REST interface
//                config.exposeIdsFor(SupperHero.class);
                // Specify JSON instead of default HAL+JSON
                //config.setDefaultMediaType(MediaType.APPLICATION_JSON);
            }
        };
    }
}
