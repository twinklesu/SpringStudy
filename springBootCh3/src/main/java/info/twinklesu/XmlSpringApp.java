package info.twinklesu;

import basic.WorkService;
import org.springframework.context.support.GenericXmlApplicationContext;

public class XmlSpringApp {
    public static void main(String[] args) {
        GenericXmlApplicationContext context = new GenericXmlApplicationContext("springBootCh3/src/main/resources/applicationContext.xml");

        WorkService yourWorkService = context.getBean("yourWorkService", WorkService.class);
        yourWorkService.askWork();

        WorkService workService = context.getBean("myWorkService", WorkService.class);
        workService.askWork();

        context.close();
    }
}
