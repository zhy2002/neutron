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

    @Provides @SelectAccountHolderNodeScope @Owner SelectAccountHolderNode provideSelectAccountHolderNode() {
        return owner;
    }

    @Provides @SelectAccountHolderNodeScope @Owner ObjectUiNode<?> provideObjectUiNode() {
        return owner;
    }

    @Provides @SelectAccountHolderNodeScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @SelectAccountHolderNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @SelectAccountHolderNodeScope SelectAccountHolderListNode<?> provideSelectAccountHolderListNode() {
        return owner.getParent();
    }

    @Provides @SelectAccountHolderNodeScope
    RuleProvider<SelectAccountHolderNode> provideRuleProvider(Provider<SelectAccountHolderNodeRuleProvider> provider) {
        return provider.get();
    }

}