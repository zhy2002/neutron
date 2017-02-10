package zhy2002.examples.lodgement.gen;

import dagger.MembersInjector;
import javax.inject.Inject;
import javax.inject.Singleton;


interface AdditionalNodeChildFactory {
}

@Singleton
public class AdditionalNodeChildProvider {

    @Inject
    protected AdditionalNodeChildProvider () {}

    AdditionalNodeChildFactory createFactory(AdditionalNode parent) {
        return new AdditionalNodeChildFactoryImpl(parent);
    }

    private class AdditionalNodeChildFactoryImpl implements AdditionalNodeChildFactory {

        private final AdditionalNode parent;
        
        private AdditionalNodeChildFactoryImpl(AdditionalNode parent) {
            this.parent = parent;
        }

    }
}
