/**
 * Created by hamid on 7/8/2015.
 */

import UI.FormMainPage;
import com.mongodb.MongoClient;
import content.Comment;
import content.Content;
import content.ContentCatalogue;
import content.Relationship;
import org.mongodb.morphia.Morphia;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import user.User;

import java.awt.*;
import java.net.UnknownHostException;
import java.util.HashSet;
import java.util.Set;

@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages = {"UI", "user","content","repository"})
@EnableMongoRepositories
//@SpringBootApplication
public class Main {

    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                UserLoginDialog loginPage = new UserLoginDialog();
//                FormMainPage mainPage = new FormMainPage();
                loginPage.setVisible(true);
            }
        });
        SpringApplication.run(Main.class, args);

    }

    @Bean
    public MongoClient mongoClient() throws UnknownHostException {
        return new MongoClient("localhost", 27017);
    }

    @Bean
    public Morphia morphia() {
        Set classesToMap = new HashSet();
        classesToMap.add(Content.class);
        classesToMap.add(User.class);
        classesToMap.add(Comment.class);
        classesToMap.add(Relationship.class);
        return new Morphia(classesToMap);
    }

 }

