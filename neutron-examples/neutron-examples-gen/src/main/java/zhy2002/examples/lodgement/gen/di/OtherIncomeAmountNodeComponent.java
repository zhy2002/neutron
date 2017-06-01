package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ComponentScope
@Subcomponent(modules = {OtherIncomeAmountNodeModule.class})
public interface OtherIncomeAmountNodeComponent {


    RuleProvider<OtherIncomeAmountNode> getOtherIncomeAmountNodeRuleProvider();
    Map<String, RuleProvider<OtherIncomeAmountNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setOtherIncomeAmountNodeModule(OtherIncomeAmountNodeModule module);

        OtherIncomeAmountNodeComponent build();
    }

}
