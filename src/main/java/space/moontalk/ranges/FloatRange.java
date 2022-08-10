package space.moontalk.ranges;

import org.jetbrains.annotations.NotNull;

public class FloatRange extends AbstractRange<Float> {
    public FloatRange(@NotNull Float low, @NotNull Float high) {
        super(low, high);
    }
}
