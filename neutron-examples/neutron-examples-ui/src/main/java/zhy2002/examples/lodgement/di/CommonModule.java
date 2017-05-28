package zhy2002.examples.lodgement.di;

import dagger.Binds;
import dagger.Module;
import zhy2002.examples.lodgement.gen.ApplicationNodeContext;
import zhy2002.examples.lodgement.gen.di.LegalActionNodeScope;
import zhy2002.examples.lodgement.gen.node.AddressRefListNode;
import zhy2002.examples.lodgement.gen.node.ApplicationNode;
import zhy2002.examples.lodgement.gen.node.ApplicationNodeChildProvider;
import zhy2002.examples.lodgement.gen.node.LegalActionNodeRuleProvider;
import zhy2002.examples.lodgement.nab.node.AddressRefListNodeImpl;
import zhy2002.examples.lodgement.nab.node.ApplicationNodeContextImpl;
import zhy2002.examples.lodgement.nab.node.ApplicationNodeImpl;
import zhy2002.examples.lodgement.nab.node.LodgementValidationErrorListAdaptor;
import zhy2002.neutron.UiNodeRule;
import zhy2002.neutron.ValidationErrorListAdaptor;
import zhy2002.neutron.rule.StringEnableSiblingRule;

import javax.inject.Inject;
import javax.inject.Provider;
import javax.inject.Singleton;
import java.util.List;

@Module
public abstract class CommonModule {

    @Binds
    @Singleton
    abstract ApplicationNodeContext provideApplicationNodeContext(ApplicationNodeContextImpl impl);

    @Binds
    @Singleton
    abstract ApplicationNode provideApplicationNode(ApplicationNodeImpl impl);

    @Binds
    abstract ValidationErrorListAdaptor provideValidationErrorListAdaptor(LodgementValidationErrorListAdaptor impl);

    @Binds
    abstract ApplicationNodeChildProvider provideApplicationNodeChildProvider(ApplicationNodeChildProviderImpl impl);

}


@Singleton
class ApplicationNodeChildProviderImpl extends ApplicationNodeChildProvider {

    @Inject
    public ApplicationNodeChildProviderImpl() {
    }

    @Override
    protected AddressRefListNode newAddressRefListNode(ApplicationNode parent, String name) {
        return new AddressRefListNodeImpl(parent, name);
    }
}
