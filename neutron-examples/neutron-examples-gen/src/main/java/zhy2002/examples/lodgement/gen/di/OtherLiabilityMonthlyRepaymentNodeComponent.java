package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@OtherLiabilityMonthlyRepaymentNodeScope
@Subcomponent(modules = {OtherLiabilityMonthlyRepaymentNodeModule.class})
public interface OtherLiabilityMonthlyRepaymentNodeComponent {

    OtherLiabilityMonthlyRepaymentNodeRuleProvider getOtherLiabilityMonthlyRepaymentNodeRuleProvider();
    Map<String, RuleProvider<OtherLiabilityMonthlyRepaymentNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setOtherLiabilityMonthlyRepaymentNodeModule(OtherLiabilityMonthlyRepaymentNodeModule module);

        OtherLiabilityMonthlyRepaymentNodeComponent build();
    }
}
