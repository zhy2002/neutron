package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@OtherIncomeAmountNodeScope
@Subcomponent(modules = {OtherIncomeAmountNodeModule.class})
public interface OtherIncomeAmountNodeComponent {

    OtherIncomeAmountNodeRuleProvider getOtherIncomeAmountNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setOtherIncomeAmountNodeModule(OtherIncomeAmountNodeModule module);

        OtherIncomeAmountNodeComponent build();
    }
}
