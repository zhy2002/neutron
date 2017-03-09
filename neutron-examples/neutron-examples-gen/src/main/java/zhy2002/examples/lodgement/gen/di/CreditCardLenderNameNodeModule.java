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

    @Provides @CreditCardLenderNameNodeScope @Owner CreditCardLenderNameNode provideCreditCardLenderNameNode() {
        return owner;
    }

    @Provides @CreditCardLenderNameNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @CreditCardLenderNameNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @CreditCardLenderNameNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @CreditCardLenderNameNodeScope CreditCardNode provideCreditCardNode() {
        return owner.getParent();
    }

    @Provides @CreditCardLenderNameNodeScope
    Map<String, RuleProvider<CreditCardLenderNameNode>> provideInstanceProviders(
        Provider<CreditCardNodeChildProvider.CreditCardLenderNameNodeRuleProvider> creditCardLenderNameNodeRuleProvider
    ) {
        Map<String, RuleProvider<CreditCardLenderNameNode>> result = new HashMap<>();
        result.put("creditCardLenderNameNode", creditCardLenderNameNodeRuleProvider.get());
        return result;
    }
}