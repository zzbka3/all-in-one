package core.model;

public class Structure {
    private double stepByStep = 0.0;
    private double bulletPoints = 0.0;

    public void merge(Structure other) {
        this.stepByStep = (this.stepByStep + other.stepByStep) / 2;
        this.bulletPoints = (this.bulletPoints + other.bulletPoints) / 2;
    }

    public double getStepByStep() { return stepByStep; }
    public void setStepByStep(double stepByStep) { this.stepByStep = stepByStep; }

    public double getBulletPoints() { return bulletPoints; }
    public void setBulletPoints(double bulletPoints) { this.bulletPoints = bulletPoints; }
}
