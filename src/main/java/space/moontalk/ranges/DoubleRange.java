package space.moontalk.ranges;

import org.jetbrains.annotations.NotNull;

public class DoubleRange extends AbstractRange<Double> {
    public DoubleRange(@NotNull Double low, @NotNull Double high) {
        super(low, high);
    }
}
