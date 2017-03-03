package zhy2002.examples.di;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class MyDataReader {

    @Inject
    MySubClass mySubClass;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    private String value = "default";

    @Inject
    MyDataReader() {}

    public MySubClass getMySubClass() {
        return mySubClass;
    }
}
