package core.model;

public class Interaction {
    private double instructionStrength = 0.0;
    private double correctionFrequency = 0.0;

    public void merge(Interaction other) {
        this.instructionStrength = (this.instructionStrength + other.instructionStrength) / 2;
        this.correctionFrequency = (this.correctionFrequency + other.correctionFrequency) / 2;
    }

    public double getInstructionStrength() { return instructionStrength; }
    public void setInstructionStrength(double instructionStrength) { this.instructionStrength = instructionStrength; }

    public double getCorrectionFrequency() { return correctionFrequency; }
    public void setCorrectionFrequency(double correctionFrequency) { this.correctionFrequency = correctionFrequency; }
}
