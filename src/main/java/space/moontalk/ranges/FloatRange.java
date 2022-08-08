package space.moontalk.ranges;

import org.checkerframework.checker.nullness.qual.NonNull;

public class FloatRange extends AbstractRange<Float> {
    public FloatRange(@NonNull Float low, @NonNull Float high) {
        super(low, high);
    }
}
