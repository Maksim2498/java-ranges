package space.moontalk.ranges;

import org.jetbrains.annotations.NotNull;

public class IntegerRange extends AbstractRange<Integer> {
    public IntegerRange(@NotNull Integer low, @NotNull Integer high) {
        super(low, high);
    }
}
