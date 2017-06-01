package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class TrustBeneficiaryClassListNodeModule {

    private final TrustBeneficiaryClassListNode owner;

    public TrustBeneficiaryClassListNodeModule(TrustBeneficiaryClassListNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner TrustBeneficiaryClassListNode provideTrustBeneficiaryClassListNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner ListUiNode<?,?> provideListUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ComponentScope BaseTrustNode<?> provideBaseTrustNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<TrustBeneficiaryClassListNode> provideRuleProvider(Provider<TrustBeneficiaryClassListNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<TrustBeneficiaryClassListNode>> provideInstanceProviderMap(
        Provider<BaseTrustNodeChildProvider.TrustBeneficiaryClassListNodeRuleProvider> trustBeneficiaryClassListNodeRuleProvider
    ) {
        Map<String, RuleProvider<TrustBeneficiaryClassListNode>> result = new HashMap<>();
        result.put("trustBeneficiaryClassListNode", trustBeneficiaryClassListNodeRuleProvider.get());
        return result;
    }
}