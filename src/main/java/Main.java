import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SpringContextConfiguration.class);
        Cart cart = context.getBean(Cart.class);
        System.out.println(cart);
        ConsoleApp consoleApp = new ConsoleApp();
        consoleApp.consoleApp(cart);
        System.out.println(cart);
        //Проверка аннотации Scope("prototype")
        cart = context.getBean(Cart.class);
        System.out.println(cart);
        ProductRepository pr = context.getBean(ProductRepository.class);
        System.out.println(pr.findAll());
    }
}
