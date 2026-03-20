package core.generator;

import core.model.Persona;
import core.model.Preferences;

public class PromptGenerator {

    public String generate(Persona persona) {
        StringBuilder sb = new StringBuilder();

        sb.append("You need to adapt to the user's style:\n\n");

        // Technical Background
        sb.append("[Technical Background]\n");
        String background = persona.getProfile().getBackground();
        if (background != null && !background.isEmpty()) {
            sb.append("- ").append(background).append("\n");
        } else {
            sb.append("- Unknown\n");
        }

        // Response Preference
        sb.append("\n[Response Preference]\n");
        Preferences pref = persona.getPreferences();

        if (pref.getSolutionFirst() > 0.5) {
            sb.append("- Provide solutions first\n");
        }
        if (pref.getCodeFirst() > 0.5) {
            sb.append("- Include code when possible\n");
        }
        if (pref.getTheoryTolerance() < 0.5) {
            sb.append("- Avoid long theoretical explanations\n");
        }

        // Communication Style
        sb.append("\n[Communication Style]\n");
        String tone = persona.getStyle().getTone();
        if (tone != null && !tone.isEmpty()) {
            sb.append("- ").append(tone).append("\n");
        }
        if (persona.getStructure().getStepByStep() > 0.5) {
            sb.append("- Structured (step-by-step)\n");
        }

        sb.append("\nAlways follow the above style when responding.");

        return sb.toString();
    }
}
