package core.normalize;

import core.model.Persona;

import java.util.function.DoubleConsumer;

public class PersonaNormalizer {

    public Persona normalize(Persona input) {
        // 保证范围在 0~1
        clamp(input.getPreferences()::setCodeFirst, input.getPreferences().getCodeFirst());
        clamp(input.getPreferences()::setSolutionFirst, input.getPreferences().getSolutionFirst());
        clamp(input.getPreferences()::setTheoryTolerance, input.getPreferences().getTheoryTolerance());

        return input;
    }

    private void clamp(DoubleConsumer setter, double value) {
        if (value < 0) setter.accept(0);
        else if (value > 1) setter.accept(1);
        else setter.accept(value);
    }
}
