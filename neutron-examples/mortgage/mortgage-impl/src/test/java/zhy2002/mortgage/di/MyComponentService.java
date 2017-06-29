package zhy2002.mortgage.di;

import javax.inject.Inject;

public class MyComponentService {
    public MyOtherComponent getMyOtherComponent() {
        return myOtherComponent;
    }

    private final MyOtherComponent myOtherComponent;

    @Inject
    public MyComponentService(MyOtherComponent component) {
        myOtherComponent = component;
    }



}
