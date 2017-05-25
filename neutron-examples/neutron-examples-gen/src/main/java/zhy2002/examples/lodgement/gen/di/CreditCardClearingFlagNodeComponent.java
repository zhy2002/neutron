package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@CreditCardClearingFlagNodeScope
@Subcomponent(modules = {CreditCardClearingFlagNodeModule.class})
public interface CreditCardClearingFlagNodeComponent {

    RuleProvider<CreditCardClearingFlagNode> getCreditCardClearingFlagNodeRuleProvider();
    Map<String, RuleProvider<CreditCardClearingFlagNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setCreditCardClearingFlagNodeModule(CreditCardClearingFlagNodeModule module);

        CreditCardClearingFlagNodeComponent build();
    }
}
