package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ComponentScope
@Subcomponent(modules = {CreditCardAmountOwingNodeModule.class})
public interface CreditCardAmountOwingNodeComponent {


    RuleProvider<CreditCardAmountOwingNode> getCreditCardAmountOwingNodeRuleProvider();
    Map<String, RuleProvider<CreditCardAmountOwingNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setCreditCardAmountOwingNodeModule(CreditCardAmountOwingNodeModule module);

        CreditCardAmountOwingNodeComponent build();
    }

}
