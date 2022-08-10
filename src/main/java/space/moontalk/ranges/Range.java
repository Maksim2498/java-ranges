package space.moontalk.ranges;

import org.jetbrains.annotations.NotNull;

public interface Range<T extends Comparable<T>> {
    default boolean contains(@NotNull T value) {
        return value.compareTo(getLow())  >= 0 
            && value.compareTo(getHigh()) <= 0;
    }

    T getLow();
    T getHigh();
}
