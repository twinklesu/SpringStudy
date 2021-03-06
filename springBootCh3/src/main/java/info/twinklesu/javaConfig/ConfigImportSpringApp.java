package info.twinklesu.javaConfig;

import basic.WorkService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConfigImportSpringApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);

        WorkService yourWorkService = context.getBean("yourWorkService", WorkService.class);
        yourWorkService.askWork();

        WorkService myWorkService = context.getBean("myWorkService", WorkService.class);
        myWorkService.askWork();

        Company company = context.getBean("company", Company.class);
        company.getName();

        context.close();
    }
}
