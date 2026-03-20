package core;

import core.extractor.RuleBasedExtractor;
import core.generator.PromptGenerator;
import core.model.ChatMessage;
import core.model.Persona;
import core.normalize.PersonaNormalizer;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<ChatMessage> chat = List.of(
                new ChatMessage("user", "帮我优化SQL，直接给方案"),
                new ChatMessage("assistant", "这里是一些原理..."),
                new ChatMessage("user", "不要讲原理，直接给代码")
        );

        RuleBasedExtractor extractor = new RuleBasedExtractor();
        Persona persona = extractor.extract(chat);

        PersonaNormalizer normalizer = new PersonaNormalizer();
        persona = normalizer.normalize(persona);

        PromptGenerator generator = new PromptGenerator();
        String prompt = generator.generate(persona);

        System.out.println(prompt);
    }
}
