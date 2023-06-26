package academy.atl.triviaMundial;

import academy.atl.triviaMundial.entities.Categoria;
import academy.atl.triviaMundial.entities.Pregunta;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TriviaController {

    @GetMapping("/question/{categoria}")
    public String getQuestion(@PathVariable String categoria){

        ChatGptClient chatGpt = new ChatGptClient();
        String respuestaJson = chatGpt.enviarPregunta("Estoy armando una trivia, necesito que me des una pregunta de la categoria " + categoria + ", con la siguiente estructura de JSON. LA respuesta de la pregunta no siempre tiene que ser la primera, tiene que variar:" +
                "\n" +
                "{\n" +
                "  \"category\": \"aqui va el nombre de la categoria\",\n" +
                "  \"question\": \" aqui va la pregunta\",\n" +
                "  \"options\": [\n" +
                "    \"aqui va la opcion 1\",\n" +
                "    \"aqui va la opcion 2\",\n" +
                "    \"aqui va la opcion 3\"\n" +
                "  ],\n" +
                "  \"answer\": aqui va la respuesta correcta en caso de ser la primera es el numero 0 en caso de ser la segunda es el 1 y en caso de ser la tercera es el 2,\n" +
                "  \"explanation\": \"aqui tiene que poner una explicacion diciendo porque es la respuesta correcta\"\n" +
                "}");

        return respuestaJson;
    }

    @GetMapping("/categories")
    public Categoria[] getCategories(){

        Categoria cat= new Categoria();
        cat.setCategory("Arte");
        cat.setDescription("Preguntas relacionadas con pintura, escultura, arquitectura y otras formas de expresión artística.");

        Categoria cat2= new Categoria();
        cat2.setCategory("Deportes");
        cat2.setDescription("Preguntas relacionadas con diversos deportes y eventos deportivos.");

        Categoria cat3= new Categoria();
        cat3.setCategory("Cultura");
        cat3.setDescription("Preguntas relacionadas con diversas culturas.");

        Categoria[] categorias = new Categoria[3];
        categorias[0] = cat;
        categorias[1] = cat2;
        categorias[2] = cat3;

        return  categorias;
    }
}