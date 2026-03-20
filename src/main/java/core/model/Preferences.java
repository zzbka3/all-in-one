package core.model;

public class Preferences {

    private double codeFirst = 0.0;
    private double solutionFirst = 0.0;
    private double theoryTolerance = 1.0; // 越低越讨厌理论

    public void merge(Preferences other) {
        this.codeFirst = avg(this.codeFirst, other.codeFirst);
        this.solutionFirst = avg(this.solutionFirst, other.solutionFirst);
        this.theoryTolerance = avg(this.theoryTolerance, other.theoryTolerance);
    }

    private double avg(double a, double b) {
        return (a + b) / 2.0;
    }

    // getter/setter
    public double getCodeFirst() { return codeFirst; }
    public void setCodeFirst(double codeFirst) { this.codeFirst = codeFirst; }

    public double getSolutionFirst() { return solutionFirst; }
    public void setSolutionFirst(double solutionFirst) { this.solutionFirst = solutionFirst; }

    public double getTheoryTolerance() { return theoryTolerance; }
    public void setTheoryTolerance(double theoryTolerance) { this.theoryTolerance = theoryTolerance; }
}
