package zhy2002.examples.register.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.register.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class PropertyDetailsNodeModule {

    private final PropertyDetailsNode owner;

    public PropertyDetailsNodeModule(PropertyDetailsNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner PropertyDetailsNode providePropertyDetailsNode() {
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

    @Provides @ComponentScope RegisterNode provideRegisterNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<PropertyDetailsNode> provideRuleProvider(Provider<PropertyDetailsNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<PropertyDetailsNode>> provideInstanceProviderMap(
        Provider<RegisterNodeChildProvider.ResidentialPropertyNodeRuleProvider> residentialPropertyNodeRuleProvider
        ,Provider<RegisterNodeChildProvider.InvestmentPropertyNodeRuleProvider> investmentPropertyNodeRuleProvider
    ) {
        Map<String, RuleProvider<PropertyDetailsNode>> result = new HashMap<>();
        result.put("residentialPropertyNode", residentialPropertyNodeRuleProvider.get());
        result.put("investmentPropertyNode", investmentPropertyNodeRuleProvider.get());
        return result;
    }
}