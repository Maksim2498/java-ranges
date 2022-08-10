package space.moontalk.ranges;

import org.jetbrains.annotations.NotNull;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public abstract class AbstractRange<T extends Comparable<T>> implements Range<T> {
    @NotNull
    private final T low;

    @NotNull
    private final T high;
}
