import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld beanHWone =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(beanHWone.getMessage());
        HelloWorld beanHWtwo =
                (HelloWorld) applicationContext.getBean("helloworld");

        System.out.println(beanHWtwo.getMessage());
        Cat beanCatOne =
                (Cat) applicationContext.getBean("cat");
        System.out.println(beanCatOne.getName());
        Cat beanCatTwo =
                (Cat) applicationContext.getBean("cat");
        System.out.println(beanCatTwo.getName());
        System.out.println(beanHWone == beanHWtwo);
        System.out.println(beanCatOne == beanCatTwo);
//        System.out.println(beanHWone.equals(beanHWtwo));
//        System.out.println(beanCatOne.equals(beanCatTwo));
    }
}