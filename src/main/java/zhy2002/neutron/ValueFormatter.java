package zhy2002.neutron;

import jsinterop.annotations.JsType;

/**
 * Convert a value to String.
 *
 * @param <T> the type of the value.
 */
@FunctionalInterface
@JsType
public interface ValueFormatter<T> {

    String format(T value);
}
