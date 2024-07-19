// Spring Core
// Spring Core is the core module of the Spring Framework and provides the fundamental features, including dependency injection (DI) and inversion of control (IoC).

// Dependency Injection: Allows the creation of loosely coupled applications by injecting dependencies at runtime.


@Component
public class MyService {
    public void doWork() {
        System.out.println("Service is working");
    }
}

@Component
public class MyApp {
    private final MyService myService;

    @Autowired
    public MyApp(MyService myService) {
        this.myService = myService;
    }

    public void run() {
        myService.doWork();
    }
}

@Configuration
@ComponentScan(basePackages = "com.example")
public class AppConfig {
}

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        MyApp app = context.getBean(MyApp.class);
        app.run();
        context.close();
    }
}
