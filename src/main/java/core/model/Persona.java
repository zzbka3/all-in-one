package core.model;

import java.util.*;

public class Persona {

    private String version = "v1";

    private Profile profile = new Profile();
    private Style style = new Style();
    private Preferences preferences = new Preferences();
    private Structure structure = new Structure();
    private Interaction interaction = new Interaction();

    private List<String> antiPatterns = new ArrayList<>();

    // ===== getter/setter =====

    public Profile getProfile() { return profile; }
    public Style getStyle() { return style; }
    public Preferences getPreferences() { return preferences; }
    public Structure getStructure() { return structure; }
    public Interaction getInteraction() { return interaction; }
    public List<String> getAntiPatterns() { return antiPatterns; }

    // ===== merge（核心🔥）=====
    public void merge(Persona other) {
        this.preferences.merge(other.preferences);
        this.structure.merge(other.structure);
        this.interaction.merge(other.interaction);

        if (other.style.getTone() != null) {
            this.style.setTone(other.style.getTone());
        }

        this.antiPatterns.addAll(other.antiPatterns);
    }
}
