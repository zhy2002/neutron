package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@FinancialPositionNodeScope
@Subcomponent(modules = {FinancialPositionNodeModule.class})
public interface FinancialPositionNodeComponent {

    FinancialPositionNodeRuleProvider getFinancialPositionNodeRuleProvider();
    Map<String, RuleProvider<FinancialPositionNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setFinancialPositionNodeModule(FinancialPositionNodeModule module);

        FinancialPositionNodeComponent build();
    }
}
