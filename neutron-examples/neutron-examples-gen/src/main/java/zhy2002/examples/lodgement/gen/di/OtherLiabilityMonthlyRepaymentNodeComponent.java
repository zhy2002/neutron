package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ComponentScope
@Subcomponent(modules = {OtherLiabilityMonthlyRepaymentNodeModule.class})
public interface OtherLiabilityMonthlyRepaymentNodeComponent {

    RuleProvider<OtherLiabilityMonthlyRepaymentNode> getOtherLiabilityMonthlyRepaymentNodeRuleProvider();
    Map<String, RuleProvider<OtherLiabilityMonthlyRepaymentNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setOtherLiabilityMonthlyRepaymentNodeModule(OtherLiabilityMonthlyRepaymentNodeModule module);

        OtherLiabilityMonthlyRepaymentNodeComponent build();
    }
}
