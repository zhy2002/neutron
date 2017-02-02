package zhy2002.examples.di;

import javax.inject.Inject;

public class MyServiceConsumer {

    private final MyServiceProvider myServiceProvider;

    @Inject
    MyOtherServiceProvider myOtherServiceProvider;

    @Inject
    MyDataReader dataReader;

    @Inject
    public MyServiceConsumer(MyServiceProvider provider) {
        this.myServiceProvider = provider;
    }

    public MyServiceProvider getMyServiceProvider() {
        return myServiceProvider;
    }

    public MyOtherServiceProvider getMyOtherServiceProvider() {
        return myOtherServiceProvider;
    }

    public MyDataReader getDataReader() {
        return dataReader;
    }
}
