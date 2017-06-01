package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {CreditCardBreakCostNodeModule.class})
public interface CreditCardBreakCostNodeComponent {

    List<RuleProvider<CreditCardBreakCostNode>> provideRuleProviders();


    @Subcomponent.Builder
    interface Builder {

        Builder setCreditCardBreakCostNodeModule(CreditCardBreakCostNodeModule module);

        CreditCardBreakCostNodeComponent build();
    }

}
