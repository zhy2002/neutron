package zhy2002.examples.app.gen;

import dagger.MembersInjector;
import javax.inject.Inject;
import javax.inject.Singleton;


interface AppManagerNodeChildFactory {
}

@Singleton
public class AppManagerNodeChildProvider {

    @Inject
    protected AppManagerNodeChildProvider () {}

    AppManagerNodeChildFactory createFactory(AppManagerNode parent) {
        return new AppManagerNodeChildFactoryImpl(parent);
    }

    private class AppManagerNodeChildFactoryImpl implements AppManagerNodeChildFactory {

        private final AppManagerNode parent;
        
        private AppManagerNodeChildFactoryImpl(AppManagerNode parent) {
            this.parent = parent;
        }

    }
}
