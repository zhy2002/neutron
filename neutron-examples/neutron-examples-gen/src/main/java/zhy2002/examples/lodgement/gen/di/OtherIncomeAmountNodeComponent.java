package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@OtherIncomeAmountNodeScope
@Subcomponent(modules = {OtherIncomeAmountNodeModule.class})
public interface OtherIncomeAmountNodeComponent {

    OtherIncomeAmountNodeRuleProvider getOtherIncomeAmountNodeRuleProvider();
    Map<String, RuleProvider<OtherIncomeAmountNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setOtherIncomeAmountNodeModule(OtherIncomeAmountNodeModule module);

        OtherIncomeAmountNodeComponent build();
    }
}
