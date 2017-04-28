package zhy2002.examples.lodgement.node;

import zhy2002.examples.lodgement.gen.ApplicationNodeContext;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class ApplicationNodeContextImpl extends ApplicationNodeContext {

    @Inject
    public ApplicationNodeContextImpl() {
        super();
    }

    @Override
    public void setContentLevel(int level) {
        getRootNode().setContentLevel(level);
    }
}
