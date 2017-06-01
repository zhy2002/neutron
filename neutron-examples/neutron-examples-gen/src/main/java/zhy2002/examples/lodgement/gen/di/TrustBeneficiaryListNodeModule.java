package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class TrustBeneficiaryListNodeModule {

    private final TrustBeneficiaryListNode owner;

    public TrustBeneficiaryListNodeModule(TrustBeneficiaryListNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner TrustBeneficiaryListNode provideTrustBeneficiaryListNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner SelectRelatedPersonListNode<?> provideSelectRelatedPersonListNode() {
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

    @Provides @ChildName String provideChildName() {
        return owner.getContext().getNameOfNodeBeingCreated();
    }

    @Provides @ComponentScope BaseTrustNode<?> provideBaseTrustNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<TrustBeneficiaryListNode> provideRuleProvider(Provider<TrustBeneficiaryListNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<TrustBeneficiaryListNode>> provideInstanceProviderMap(
        Provider<BaseTrustNodeChildProvider.TrustBeneficiaryListNodeRuleProvider> trustBeneficiaryListNodeRuleProvider
    ) {
        Map<String, RuleProvider<TrustBeneficiaryListNode>> result = new HashMap<>();
        result.put("trustBeneficiaryListNode", trustBeneficiaryListNodeRuleProvider.get());
        return result;
    }
}