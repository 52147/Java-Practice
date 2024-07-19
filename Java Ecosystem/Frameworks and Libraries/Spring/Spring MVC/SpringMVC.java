// Spring MVC
// Spring MVC (Model-View-Controller) is a framework for building web applications. It provides a way to create web applications using the MVC design pattern.

// Controllers: Handle web requests and return views or data.
@Controller
public class MyController {
    
    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        return "Hello, World!";
    }
}
