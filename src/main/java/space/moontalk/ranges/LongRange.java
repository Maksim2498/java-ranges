package space.moontalk.ranges;

import org.jetbrains.annotations.NotNull;

public class LongRange extends AbstractRange<Long> {
    public LongRange(@NotNull Long low, @NotNull Long high) {
        super(low, high);
    }
}
