package example.demo;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Controlador {
    @RequestMapping("/Saludo")
    @ResponseBody
    List<Docente> respuesta(Repo datos) {
        return (List<Docente>) datos.findAll();
    }
}
