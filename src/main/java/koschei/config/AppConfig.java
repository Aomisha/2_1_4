package koschei.config;

import koschei.models.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = "koschei")
public class AppConfig {


    @Bean
    @Scope("singleton")
    public static Wood3 getWood(){
        return new Wood3();
    }

    @Bean
    @Scope("singleton")
    public static Rabbit4 getRabbit(){
        return new Rabbit4();
    }

    @Bean
    @Scope("singleton")
    public static Duck5 getDuck() {
        return new Duck5();
    }

    @Bean
    @Scope("singleton")
    public static Egg6 getEgg(){
        return new Egg6();
    }

    @Bean
    @Scope("singleton")
    public static Needle7 getNeedle(){
        return new Needle7();
    }

    @Bean
    @Scope("singleton")
    public static Deth8 getDeth(){
        return new Deth8();
    }
}
