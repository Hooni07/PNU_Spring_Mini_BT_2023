package shop.mtcoding.blogv2.board;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class BoardController {

    @GetMapping({"", "/", "/board"})
    public String home(){
        return "index";
    }

    @GetMapping("/board/{id}")
    public String boardDetail(@PathVariable Integer id){
        return "board/detail";
    }

    @GetMapping("/board/saveForm")
    public String saveForm(){
        return "board/saveForm";
    }

    @GetMapping("/board/updateForm")
    public String boardUpdateForm(){
        return "board/updateForm";
    }




}
