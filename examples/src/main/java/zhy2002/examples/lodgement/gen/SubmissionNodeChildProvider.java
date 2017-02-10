package zhy2002.examples.lodgement.gen;

import dagger.MembersInjector;
import javax.inject.Inject;
import javax.inject.Singleton;


interface SubmissionNodeChildFactory {
}

@Singleton
public class SubmissionNodeChildProvider {

    @Inject
    protected SubmissionNodeChildProvider () {}

    SubmissionNodeChildFactory createFactory(SubmissionNode parent) {
        return new SubmissionNodeChildFactoryImpl(parent);
    }

    private class SubmissionNodeChildFactoryImpl implements SubmissionNodeChildFactory {

        private final SubmissionNode parent;
        
        private SubmissionNodeChildFactoryImpl(SubmissionNode parent) {
            this.parent = parent;
        }

    }
}
