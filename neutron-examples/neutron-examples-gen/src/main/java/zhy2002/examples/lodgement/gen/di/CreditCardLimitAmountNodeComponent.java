package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ComponentScope
@Subcomponent(modules = {CreditCardLimitAmountNodeModule.class})
public interface CreditCardLimitAmountNodeComponent {

    RuleProvider<CreditCardLimitAmountNode> getCreditCardLimitAmountNodeRuleProvider();
    Map<String, RuleProvider<CreditCardLimitAmountNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setCreditCardLimitAmountNodeModule(CreditCardLimitAmountNodeModule module);

        CreditCardLimitAmountNodeComponent build();
    }
}
