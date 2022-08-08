package space.moontalk.ranges;

import org.checkerframework.checker.nullness.qual.NonNull;

public class LongRange extends AbstractRange<Long> {
    public LongRange(@NonNull Long low, @NonNull Long high) {
        super(low, high);
    }
}
