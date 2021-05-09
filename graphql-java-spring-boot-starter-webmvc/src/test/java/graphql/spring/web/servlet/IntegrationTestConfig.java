package graphql.spring.web.servlet;

import com.atlassian.connect.spring.AtlassianHostRepository;
import graphql.GraphQL;
import org.mockito.Mockito;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class IntegrationTestConfig {


    @Bean
    public GraphQL graphQL() {
        return Mockito.mock(GraphQL.class);
    }

    @Bean
    public AtlassianHostRepository atlassianHostRepository() {return Mockito.mock(AtlassianHostRepository.class);}

}

