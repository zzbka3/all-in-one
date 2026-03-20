package core.extractor;

import core.model.*;

import java.util.List;

public class RuleBasedExtractor {

    public Persona extract(List<ChatMessage> messages) {
        Persona persona = new Persona();

        int codeCount = 0;
        int solutionCount = 0;
        int antiTheoryCount = 0;
        int total = 0;

        for (ChatMessage msg : messages) {
            if (!"user".equals(msg.getRole())) continue;

            String text = msg.getContent();
            total++;

            if (contains(text, "代码", "demo", "示例")) {
                codeCount++;
            }

            if (contains(text, "直接", "怎么做", "方案")) {
                solutionCount++;
            }

            if (contains(text, "不要讲原理", "少解释")) {
                antiTheoryCount++;
                persona.getAntiPatterns().add("long_theory");
            }

            if (contains(text, "步骤", "一步一步")) {
                persona.getStructure().setStepByStep(0.8);
            }
        }

        if (total > 0) {
            persona.getPreferences().setCodeFirst(ratio(codeCount, total));
            persona.getPreferences().setSolutionFirst(ratio(solutionCount, total));
            persona.getPreferences().setTheoryTolerance(1 - ratio(antiTheoryCount, total));
        }

        return persona;
    }

    private boolean contains(String text, String... keywords) {
        for (String k : keywords) {
            if (text.contains(k)) return true;
        }
        return false;
    }

    private double ratio(int count, int total) {
        return Math.min(1.0, (double) count / total);
    }
}
