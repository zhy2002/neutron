package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;

@OtherIncomeAddBackTypeNodeScope
@Subcomponent(modules = {OtherIncomeAddBackTypeNodeModule.class})
public interface OtherIncomeAddBackTypeNodeComponent {

    OtherIncomeAddBackTypeNodeRuleProvider getOtherIncomeAddBackTypeNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setOtherIncomeAddBackTypeNodeModule(OtherIncomeAddBackTypeNodeModule module);

        OtherIncomeAddBackTypeNodeComponent build();
    }
}
