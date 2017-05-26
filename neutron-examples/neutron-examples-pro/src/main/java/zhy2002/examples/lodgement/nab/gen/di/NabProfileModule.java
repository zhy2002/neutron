package zhy2002.examples.lodgement.nab.gen.di;

import dagger.Binds;
import dagger.Module;
import zhy2002.examples.lodgement.gen.ApplicationNodeContext;
import zhy2002.examples.lodgement.gen.di.LegalActionNodeScope;
import zhy2002.examples.lodgement.gen.di.ManifestModule;
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

@Module(includes = {ManifestModule.class})
public abstract class NabProfileModule {

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

    @Binds
    abstract LegalActionNodeRuleProvider provideLegalActionNodeRuleProvider(LegalActionNodeRuleProviderImpl impl);

}


@LegalActionNodeScope
class LegalActionNodeRuleProviderImpl extends LegalActionNodeRuleProvider {

    @Inject
    public LegalActionNodeRuleProviderImpl() {
    }

    @Inject
    Provider<StringEnableSiblingRule> stringEnableSiblingRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

        StringEnableSiblingRule rule = stringEnableSiblingRuleProvider.get();
        rule.setSiblingName("creditHistoryListNode");
        createdRules.add(rule);
    }
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