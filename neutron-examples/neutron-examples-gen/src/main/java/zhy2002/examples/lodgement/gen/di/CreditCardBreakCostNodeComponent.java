package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@CreditCardBreakCostNodeScope
@Subcomponent(modules = {CreditCardBreakCostNodeModule.class})
public interface CreditCardBreakCostNodeComponent {

    RuleProvider<CreditCardBreakCostNode> getCreditCardBreakCostNodeRuleProvider();
    Map<String, RuleProvider<CreditCardBreakCostNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setCreditCardBreakCostNodeModule(CreditCardBreakCostNodeModule module);

        CreditCardBreakCostNodeComponent build();
    }
}
