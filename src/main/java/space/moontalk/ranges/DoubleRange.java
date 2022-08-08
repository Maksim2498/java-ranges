package space.moontalk.ranges;

import org.checkerframework.checker.nullness.qual.NonNull;

public class DoubleRange extends AbstractRange<Double> {
    public DoubleRange(@NonNull Double low, @NonNull Double high) {
        super(low, high);
    }
}
