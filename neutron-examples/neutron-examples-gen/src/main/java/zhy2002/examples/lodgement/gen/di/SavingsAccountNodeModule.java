package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;


@Module
public class SavingsAccountNodeModule {

    private final SavingsAccountNode owner;

    public SavingsAccountNodeModule(SavingsAccountNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner SavingsAccountNode provideSavingsAccountNode() {
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
        return owner.getContext().getNameOfNodeBeingCreated();
    }

    @Provides @ComponentScope SavingsAccountListNode provideSavingsAccountListNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<SavingsAccountNode> provideRuleProvider(Provider<SavingsAccountNodeRuleProvider> provider) {
        return provider.get();
    }

}