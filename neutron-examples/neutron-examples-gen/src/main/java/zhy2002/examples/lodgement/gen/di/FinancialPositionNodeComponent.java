package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {FinancialPositionNodeModule.class})
public interface FinancialPositionNodeComponent {

    List<RuleProvider<FinancialPositionNode>> provideRuleProviders();

    AssetsNode createAssetsNode();
    LiabilitiesNode createLiabilitiesNode();
    ExpenseListNode createExpenseListNode();
    TotalAssetNode createTotalAssetNode();
    TotalLiabilityNode createTotalLiabilityNode();
    TotalExpenseNode createTotalExpenseNode();

    @Subcomponent.Builder
    interface Builder {

        Builder setFinancialPositionNodeModule(FinancialPositionNodeModule module);

        FinancialPositionNodeComponent build();
    }

}
