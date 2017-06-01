package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class PayeEmployedNodeModule {

    private final PayeEmployedNode owner;

    public PayeEmployedNodeModule(PayeEmployedNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner PayeEmployedNode providePayeEmployedNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner EmployedNode provideEmployedNode() {
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

    @Provides @ComponentScope EmploymentNode<?> provideEmploymentNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<PayeEmployedNode> provideRuleProvider(Provider<PayeEmployedNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<PayeEmployedNode>> provideInstanceProviderMap(
        Provider<EmploymentNodeChildProvider.PayeEmployedNodeRuleProvider> payeEmployedNodeRuleProvider
    ) {
        Map<String, RuleProvider<PayeEmployedNode>> result = new HashMap<>();
        result.put("payeEmployedNode", payeEmployedNodeRuleProvider.get());
        return result;
    }
}