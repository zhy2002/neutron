package zhy2002.neutron.core.node;

import zhy2002.neutron.core.ValueParser;

import java.math.BigDecimal;

/**
 * Parse a BigDecimal from input text or
 * format it to input text.
 */
public class BigDecimalParser implements ValueParser<BigDecimal> {

    @Override
    public BigDecimal parse(String text) {
        try {
            if (text != null) {
                return new BigDecimal(text);
            }
        } catch (Exception ex) {
            return null;
        }
        return null;
    }

    @Override
    public String format(BigDecimal value) {
        return value == null ? "" : value.toString();
    }
}