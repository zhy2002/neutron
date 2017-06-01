package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;


@Module
public class CreditCardNodeModule {

    private final CreditCardNode owner;

    public CreditCardNodeModule(CreditCardNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner CreditCardNode provideCreditCardNode() {
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

    @Provides @ComponentScope CreditCardListNode provideCreditCardListNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<CreditCardNode> provideRuleProvider(Provider<CreditCardNodeRuleProvider> provider) {
        return provider.get();
    }

}