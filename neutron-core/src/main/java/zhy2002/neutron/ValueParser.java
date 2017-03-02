package zhy2002.neutron;

import jsinterop.annotations.JsType;

/**
 * Parser a value from String.
 *
 * @param <T> value type.
 */
@FunctionalInterface
@JsType
public interface ValueParser<T> {

    T parse(String text);

}
