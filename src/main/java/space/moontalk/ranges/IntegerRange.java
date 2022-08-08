package space.moontalk.ranges;

import org.checkerframework.checker.nullness.qual.NonNull;

public class IntegerRange extends AbstractRange<Integer> {
    public IntegerRange(@NonNull Integer low, @NonNull Integer high) {
        super(low, high);
    }
}
