package space.moontalk.ranges;

import org.checkerframework.checker.nullness.qual.NonNull;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public abstract class AbstractRange<T extends Comparable<T>> implements Range<T> {
    @NonNull
    private final T low;

    @NonNull
    private final T high;
}
