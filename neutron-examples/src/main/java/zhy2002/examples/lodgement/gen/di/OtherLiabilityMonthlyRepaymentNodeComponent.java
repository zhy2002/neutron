package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@OtherLiabilityMonthlyRepaymentNodeScope
@Subcomponent(modules = {OtherLiabilityMonthlyRepaymentNodeModule.class})
public interface OtherLiabilityMonthlyRepaymentNodeComponent {

    OtherLiabilityMonthlyRepaymentNodeRuleProvider getOtherLiabilityMonthlyRepaymentNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setOtherLiabilityMonthlyRepaymentNodeModule(OtherLiabilityMonthlyRepaymentNodeModule module);

        OtherLiabilityMonthlyRepaymentNodeComponent build();
    }
}
