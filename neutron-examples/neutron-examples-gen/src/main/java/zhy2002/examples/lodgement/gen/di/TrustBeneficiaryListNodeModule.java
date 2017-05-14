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

    @Provides @TrustBeneficiaryListNodeScope @Owner TrustBeneficiaryListNode provideTrustBeneficiaryListNode() {
        return owner;
    }

    @Provides @TrustBeneficiaryListNodeScope @Owner SelectRelatedPersonListNode<?> provideSelectRelatedPersonListNode() {
        return owner;
    }

    @Provides @TrustBeneficiaryListNodeScope @Owner ListUiNode<?,?> provideListUiNode() {
        return owner;
    }

    @Provides @TrustBeneficiaryListNodeScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @TrustBeneficiaryListNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @TrustBeneficiaryListNodeScope BaseTrustNode<?> provideBaseTrustNode() {
        return owner.getParent();
    }

    @Provides @TrustBeneficiaryListNodeScope
    Map<String, RuleProvider<TrustBeneficiaryListNode>> provideInstanceProviders(
        Provider<BaseTrustNodeChildProvider.TrustBeneficiaryListNodeRuleProvider> trustBeneficiaryListNodeRuleProvider
    ) {
        Map<String, RuleProvider<TrustBeneficiaryListNode>> result = new HashMap<>();
        result.put("trustBeneficiaryListNode", trustBeneficiaryListNodeRuleProvider.get());
        return result;
    }
}