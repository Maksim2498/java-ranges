package space.moontalk.ranges;

import org.checkerframework.checker.nullness.qual.NonNull;

public interface Range<T extends Comparable<T>> {
    default boolean contains(@NonNull T value) {
        return value.compareTo(getLow())  >= 0 
            && value.compareTo(getHigh()) <= 0;
    }

    T getLow();
    T getHigh();
}
