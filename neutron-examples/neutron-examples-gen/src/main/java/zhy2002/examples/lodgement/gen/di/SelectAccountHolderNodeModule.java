package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;


@Module
public class SelectAccountHolderNodeModule {

    private final SelectAccountHolderNode owner;

    public SelectAccountHolderNodeModule(SelectAccountHolderNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner SelectAccountHolderNode provideSelectAccountHolderNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner ObjectUiNode<?> provideObjectUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ChildName String provideChildName() {
        return owner.getContext().getNodeIdentity().getName();
    }

    @Provides @ComponentScope SelectAccountHolderListNode<?> provideSelectAccountHolderListNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<SelectAccountHolderNode> provideRuleProvider(Provider<SelectAccountHolderNodeRuleProvider> provider) {
        return provider.get();
    }

}