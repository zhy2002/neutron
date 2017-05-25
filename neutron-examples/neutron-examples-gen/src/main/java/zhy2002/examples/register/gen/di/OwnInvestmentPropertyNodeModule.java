package zhy2002.examples.register.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.register.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class OwnInvestmentPropertyNodeModule {

    private final OwnInvestmentPropertyNode owner;

    public OwnInvestmentPropertyNodeModule(OwnInvestmentPropertyNode owner) {
        this.owner = owner;
    }

    @Provides @OwnInvestmentPropertyNodeScope @Owner OwnInvestmentPropertyNode provideOwnInvestmentPropertyNode() {
        return owner;
    }

    @Provides @OwnInvestmentPropertyNodeScope @Owner BooleanUiNode<?> provideBooleanUiNode() {
        return owner;
    }

    @Provides @OwnInvestmentPropertyNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @OwnInvestmentPropertyNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @OwnInvestmentPropertyNodeScope RegisterNode provideRegisterNode() {
        return owner.getParent();
    }

    @Provides @OwnInvestmentPropertyNodeScope
    RuleProvider<OwnInvestmentPropertyNode> provideRuleProvider(Provider<OwnInvestmentPropertyNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @OwnInvestmentPropertyNodeScope
    Map<String, RuleProvider<OwnInvestmentPropertyNode>> provideInstanceProviderMap(
        Provider<RegisterNodeChildProvider.OwnInvestmentPropertyNodeRuleProvider> ownInvestmentPropertyNodeRuleProvider
    ) {
        Map<String, RuleProvider<OwnInvestmentPropertyNode>> result = new HashMap<>();
        result.put("ownInvestmentPropertyNode", ownInvestmentPropertyNodeRuleProvider.get());
        return result;
    }
}