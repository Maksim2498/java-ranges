package space.moontalk.ranges;

import org.jetbrains.annotations.NotNull;

public class ByteRange extends AbstractRange<Byte> {
    public ByteRange(@NotNull Byte low, @NotNull Byte high) {
        super(low, high);
    }
}
