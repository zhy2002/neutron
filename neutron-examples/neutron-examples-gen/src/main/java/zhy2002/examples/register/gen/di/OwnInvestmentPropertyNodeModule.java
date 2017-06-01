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

    @Provides @ComponentScope @Owner OwnInvestmentPropertyNode provideOwnInvestmentPropertyNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner BooleanUiNode<?> provideBooleanUiNode() {
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

    @Provides @ComponentScope RegisterNode provideRegisterNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<OwnInvestmentPropertyNode> provideRuleProvider(Provider<OwnInvestmentPropertyNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<OwnInvestmentPropertyNode>> provideInstanceProviderMap(
        Provider<RegisterNodeChildProvider.OwnInvestmentPropertyNodeRuleProvider> ownInvestmentPropertyNodeRuleProvider
    ) {
        Map<String, RuleProvider<OwnInvestmentPropertyNode>> result = new HashMap<>();
        result.put("ownInvestmentPropertyNode", ownInvestmentPropertyNodeRuleProvider.get());
        return result;
    }
}