package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import spring.MemberDao;
import spring.MemberPrinter;

@Configuration
@Import({AppConfig1.class, AppConfig2.class}/*AppConfig2.class*/)public class AppConfImport {

        @Bean
        public MemberDao memberDao(){
            return new MemberDao();
        }

        @Bean
        public MemberPrinter printer(){
            return new MemberPrinter();
        }

}