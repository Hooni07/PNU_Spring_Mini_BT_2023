package shop.mtcoding.blogv2.user;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
    @GetMapping("/loginForm")
    public String loginForm(){
        return "user/loginForm";
    }

    @GetMapping("/joinForm")
    public String joinForm(){
        return "user/joinForm";
    }

    @GetMapping("/user/updateForm") // board에도 updateForm이 있기 때문에
    public String userUpdateForm(){
        return "user/updateForm";
    }
}
