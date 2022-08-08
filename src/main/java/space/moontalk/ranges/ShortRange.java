package space.moontalk.ranges;

import org.checkerframework.checker.nullness.qual.NonNull;

public class ShortRange extends AbstractRange<Short> {
    public ShortRange(@NonNull Short low, @NonNull Short high) {
        super(low, high);
    }
}
