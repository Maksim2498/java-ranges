package space.moontalk.ranges;

import org.jetbrains.annotations.NotNull;

public class ShortRange extends AbstractRange<Short> {
    public ShortRange(@NotNull Short low, @NotNull Short high) {
        super(low, high);
    }
}
