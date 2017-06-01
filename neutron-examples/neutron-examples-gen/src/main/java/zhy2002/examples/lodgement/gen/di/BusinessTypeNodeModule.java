package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class BusinessTypeNodeModule {

    private final BusinessTypeNode owner;

    public BusinessTypeNodeModule(BusinessTypeNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner BusinessTypeNode provideBusinessTypeNode() {
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

    @Provides @ComponentScope SelfEmployedNode provideSelfEmployedNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<BusinessTypeNode> provideRuleProvider(Provider<BusinessTypeNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<BusinessTypeNode>> provideInstanceProviderMap(
        Provider<SelfEmployedNodeChildProvider.BusinessTypeNodeRuleProvider> businessTypeNodeRuleProvider
    ) {
        Map<String, RuleProvider<BusinessTypeNode>> result = new HashMap<>();
        result.put("businessTypeNode", businessTypeNodeRuleProvider.get());
        return result;
    }
}