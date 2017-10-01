package zhy2002.neutron.core;

import jsinterop.annotations.JsType;

/**
 * Parser a value from String.
 *
 * @param <T> value type.
 */
@JsType(isNative = true)
public interface ValueParser<T> {
    T parse(String text);

    String format(T value);
}
