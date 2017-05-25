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

    @Provides @OwnershipNodeScope @Owner OwnershipNode provideOwnershipNode() {
        return owner;
    }

    @Provides @OwnershipNodeScope @Owner ObjectUiNode<?> provideObjectUiNode() {
        return owner;
    }

    @Provides @OwnershipNodeScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @OwnershipNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @OwnershipNodeScope OwnershipListNode<?> provideOwnershipListNode() {
        return owner.getParent();
    }

    @Provides @OwnershipNodeScope
    RuleProvider<OwnershipNode> provideRuleProvider(Provider<OwnershipNodeRuleProvider> provider) {
        return provider.get();
    }

}