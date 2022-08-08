package space.moontalk.ranges;

import org.checkerframework.checker.nullness.qual.NonNull;

public class ByteRange extends AbstractRange<Byte> {
    public ByteRange(@NonNull Byte low, @NonNull Byte high) {
        super(low, high);
    }
}
