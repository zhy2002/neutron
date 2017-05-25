package zhy2002.examples.lodgement.di;

import dagger.Binds;
import dagger.Module;
import zhy2002.examples.lodgement.data.ApplicationNodeConstants;
import zhy2002.examples.lodgement.gen.ApplicationNodeContext;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.node.AddressRefListNodeImpl;
import zhy2002.examples.lodgement.node.ApplicationNodeContextImpl;
import zhy2002.examples.lodgement.node.ApplicationNodeImpl;
import zhy2002.examples.lodgement.node.LodgementValidationErrorListAdaptor;
import zhy2002.examples.lodgement.rule.*;
import zhy2002.neutron.UiNodeRule;
import zhy2002.neutron.ValidationErrorListAdaptor;
import zhy2002.neutron.rule.StringEnableSiblingRule;

import javax.inject.Inject;
import javax.inject.Provider;
import javax.inject.Singleton;
import java.util.List;

@Module(includes = {ManifestModule.class})
public abstract class DefaultProfileModule {

    @Binds
    @Singleton
    abstract ApplicationNodeContext provideApplicationNodeContext(ApplicationNodeContextImpl impl);

    @Binds
    @Singleton
    abstract ApplicationNode provideApplicationNode(ApplicationNodeImpl impl);

    @Binds
    abstract UpdateAddressRefListRule provideUpdateAddressRefListRule(UpdateAddressRefListRuleImpl impl);

    @Binds
    abstract ChangeFocusErrorRule provideChangeFocusErrorRule(ChangeFocusErrorRuleImpl impl);

    @Binds
    abstract ValidationErrorListAdaptor provideValidationErrorListAdaptor(LodgementValidationErrorListAdaptor impl);

    @Binds
    abstract ShowErrorListRule provideShowErrorListRule(ShowErrorListRuleImpl impl);

    @Binds
    abstract LegalActionNodeRuleProvider provideLegalActionNodeRuleProvider(LegalActionNodeRuleProviderImpl impl);

    @Binds
    abstract ApplicationNodeChildProvider provideApplicationNodeChildProvider(ApplicationNodeChildProviderImpl impl);

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