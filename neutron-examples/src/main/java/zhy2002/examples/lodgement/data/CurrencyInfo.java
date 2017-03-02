package zhy2002.examples.lodgement.data;

import jsinterop.annotations.JsType;

@JsType
public class CurrencyInfo {

    private final String symbolName;
    private final String symbol;

    public CurrencyInfo(String symbolName, String symbol) {
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
