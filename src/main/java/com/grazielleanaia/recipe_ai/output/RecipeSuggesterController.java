package com.grazielleanaia.recipe_ai.output;


import org.springframework.ai.chat.client.ChatClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/recipe/suggester")
public class RecipeSuggesterController {


    private final ChatClient chatClient;


    public RecipeSuggesterController(ChatClient.Builder builder) {
        this.chatClient = builder.build();

    }

//    @GetMapping("/country")
//    public List<String> suggestListFromIngredient(@RequestParam(name = "ingredient",
//            defaultValue = "shrimp") String ingredient) {
//        String message = """
//                Please suggest me the best 10 dishes containing the ingredient {ingredient}.
//                Just say I don't know if you don't know the answer {format}
//                """; //prompt
//
//        final ListOutputConverter listOutputConverter = new ListOutputConverter(new DefaultConversionService());
//
//        final PromptTemplate promptTemplate = new PromptTemplate(Map.of("ingredient", ingredient,
//         "format", listOutputConverter.getFormat()), message);
//
//
//
//        String response = this.chatClient.prompt(promptTemplate.create())
//                .call()
//                .content();
//        return listOutputConverter.convert(response);
//    }

}
