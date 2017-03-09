package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@CreditCardAmountOwingNodeScope
@Subcomponent(modules = {CreditCardAmountOwingNodeModule.class})
public interface CreditCardAmountOwingNodeComponent {

    CreditCardAmountOwingNodeRuleProvider getCreditCardAmountOwingNodeRuleProvider();
    Map<String, RuleProvider<CreditCardAmountOwingNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setCreditCardAmountOwingNodeModule(CreditCardAmountOwingNodeModule module);

        CreditCardAmountOwingNodeComponent build();
    }
}
