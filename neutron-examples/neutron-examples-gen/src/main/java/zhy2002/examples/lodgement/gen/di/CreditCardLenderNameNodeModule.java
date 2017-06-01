package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class CreditCardLenderNameNodeModule {

    private final CreditCardLenderNameNode owner;

    public CreditCardLenderNameNodeModule(CreditCardLenderNameNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner CreditCardLenderNameNode provideCreditCardLenderNameNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ChildName String provideChildName() {
        return owner.getContext().getNodeIdentity().getName();
    }

    @Provides @ComponentScope CreditCardNode provideCreditCardNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<CreditCardLenderNameNode> provideRuleProvider(Provider<CreditCardLenderNameNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<CreditCardLenderNameNode>> provideInstanceProviderMap(
        Provider<CreditCardNodeChildProvider.CreditCardLenderNameNodeRuleProvider> creditCardLenderNameNodeRuleProvider
    ) {
        Map<String, RuleProvider<CreditCardLenderNameNode>> result = new HashMap<>();
        result.put("creditCardLenderNameNode", creditCardLenderNameNodeRuleProvider.get());
        return result;
    }
}