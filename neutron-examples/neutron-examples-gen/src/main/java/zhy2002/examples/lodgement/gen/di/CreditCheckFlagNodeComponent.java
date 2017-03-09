package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@CreditCheckFlagNodeScope
@Subcomponent(modules = {CreditCheckFlagNodeModule.class})
public interface CreditCheckFlagNodeComponent {

    CreditCheckFlagNodeRuleProvider getCreditCheckFlagNodeRuleProvider();
    Map<String, RuleProvider<CreditCheckFlagNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setCreditCheckFlagNodeModule(CreditCheckFlagNodeModule module);

        CreditCheckFlagNodeComponent build();
    }
}
