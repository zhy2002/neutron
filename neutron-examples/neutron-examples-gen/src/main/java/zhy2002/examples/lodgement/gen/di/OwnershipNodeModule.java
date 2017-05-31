package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;


@Module
public class OwnershipNodeModule {

    private final OwnershipNode owner;

    public OwnershipNodeModule(OwnershipNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner OwnershipNode provideOwnershipNode() {
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

    @Provides @ComponentScope OwnershipListNode<?> provideOwnershipListNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<OwnershipNode> provideRuleProvider(Provider<OwnershipNodeRuleProvider> provider) {
        return provider.get();
    }

}