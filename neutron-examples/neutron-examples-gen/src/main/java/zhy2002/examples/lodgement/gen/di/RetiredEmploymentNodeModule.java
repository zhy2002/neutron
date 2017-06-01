package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class RetiredEmploymentNodeModule {

    private final RetiredEmploymentNode owner;

    public RetiredEmploymentNodeModule(RetiredEmploymentNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner RetiredEmploymentNode provideRetiredEmploymentNode() {
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
    RuleProvider<RetiredEmploymentNode> provideRuleProvider(Provider<RetiredEmploymentNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<RetiredEmploymentNode>> provideInstanceProviderMap(
        Provider<EmploymentNodeChildProvider.RetiredEmploymentNodeRuleProvider> retiredEmploymentNodeRuleProvider
    ) {
        Map<String, RuleProvider<RetiredEmploymentNode>> result = new HashMap<>();
        result.put("retiredEmploymentNode", retiredEmploymentNodeRuleProvider.get());
        return result;
    }
}