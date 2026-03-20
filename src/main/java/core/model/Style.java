package core.model;

public class Style {
    private String tone; // concise / detailed
    private double verbosity = 0.5;

    public String getTone() { return tone; }
    public void setTone(String tone) { this.tone = tone; }

    public double getVerbosity() { return verbosity; }
    public void setVerbosity(double verbosity) { this.verbosity = verbosity; }
}
