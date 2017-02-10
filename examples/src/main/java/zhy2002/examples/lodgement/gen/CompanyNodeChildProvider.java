package zhy2002.examples.lodgement.gen;

import dagger.MembersInjector;
import javax.inject.Inject;
import javax.inject.Singleton;


interface CompanyNodeChildFactory {
}

@Singleton
public class CompanyNodeChildProvider {

    @Inject
    protected CompanyNodeChildProvider () {}

    CompanyNodeChildFactory createFactory(CompanyNode parent) {
        return new CompanyNodeChildFactoryImpl(parent);
    }

    private class CompanyNodeChildFactoryImpl implements CompanyNodeChildFactory {

        private final CompanyNode parent;
        
        private CompanyNodeChildFactoryImpl(CompanyNode parent) {
            this.parent = parent;
        }

    }
}
