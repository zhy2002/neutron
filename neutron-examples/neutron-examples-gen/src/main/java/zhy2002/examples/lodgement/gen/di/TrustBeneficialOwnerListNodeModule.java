package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class TrustBeneficialOwnerListNodeModule {

    private final TrustBeneficialOwnerListNode owner;

    public TrustBeneficialOwnerListNodeModule(TrustBeneficialOwnerListNode owner) {
        this.owner = owner;
    }

    @Provides @TrustBeneficialOwnerListNodeScope @Owner TrustBeneficialOwnerListNode provideTrustBeneficialOwnerListNode() {
        return owner;
    }

    @Provides @TrustBeneficialOwnerListNodeScope @Owner SelectRelatedPersonListNode<?> provideSelectRelatedPersonListNode() {
        return owner;
    }

    @Provides @TrustBeneficialOwnerListNodeScope @Owner ListUiNode<?,?> provideListUiNode() {
        return owner;
    }

    @Provides @TrustBeneficialOwnerListNodeScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @TrustBeneficialOwnerListNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @TrustBeneficialOwnerListNodeScope BaseTrustNode<?> provideBaseTrustNode() {
        return owner.getParent();
    }

    @Provides @TrustBeneficialOwnerListNodeScope
    RuleProvider<TrustBeneficialOwnerListNode> provideRuleProvider(Provider<TrustBeneficialOwnerListNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @TrustBeneficialOwnerListNodeScope
    Map<String, RuleProvider<TrustBeneficialOwnerListNode>> provideInstanceProviderMap(
        Provider<BaseTrustNodeChildProvider.TrustBeneficialOwnerListNodeRuleProvider> trustBeneficialOwnerListNodeRuleProvider
    ) {
        Map<String, RuleProvider<TrustBeneficialOwnerListNode>> result = new HashMap<>();
        result.put("trustBeneficialOwnerListNode", trustBeneficialOwnerListNodeRuleProvider.get());
        return result;
    }
}