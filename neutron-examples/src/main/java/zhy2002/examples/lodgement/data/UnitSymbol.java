package zhy2002.examples.lodgement.data;

import jsinterop.annotations.JsType;

/**
 * Suffix unit symbol.
 */
@JsType
public class UnitSymbol {

    private final String symbolName;
    private final String symbol;

    public UnitSymbol(String symbolName, String symbol) {
        this.symbolName = symbolName;
        this.symbol = symbol;
    }

    public String getSymbolName() {
        return symbolName;
    }

    public String getSymbol() {
        return symbol;
    }
}
