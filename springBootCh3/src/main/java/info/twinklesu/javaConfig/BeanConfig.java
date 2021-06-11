package info.twinklesu.javaConfig;

import basic.Boss;
import basic.Employee;
import basic.WorkManager;
import basic.WorkService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(CompanyConfig.class)
public class BeanConfig {
    @Bean
    public WorkManager employee() {
        return new Employee();
    }

    @Bean
    public WorkManager boss() {
        return new Boss();
    }

    @Bean
    public WorkService yourWorkService() {
        WorkService workService = new WorkService();
        workService.setWorkManager(employee());
        return workService;
    }

    @Bean
    public WorkService myWorkService() {
        WorkService workService = new WorkService();
        workService.setWorkManager(boss());
        return workService;
    }
}
