package com.grazielleanaia.recipe_ai;


import org.springframework.ai.chat.client.ChatClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/recipe")
public class RecipeController {

    private final ChatClient chatClient;

    public RecipeController(ChatClient.Builder chatClientBuilder) {
        this.chatClient = chatClientBuilder.build();
    }


    @GetMapping("/suggest-recipe")
    public String suggestRecipe(@RequestParam(name = "message",
            defaultValue = "Suggest a recipe for dinner") String message){
        return  this.chatClient.prompt()
                .user(message)
                .call()
                .content();
    }

}
