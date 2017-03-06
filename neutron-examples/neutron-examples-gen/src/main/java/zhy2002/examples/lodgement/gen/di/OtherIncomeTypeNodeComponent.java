package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;

@OtherIncomeTypeNodeScope
@Subcomponent(modules = {OtherIncomeTypeNodeModule.class})
public interface OtherIncomeTypeNodeComponent {

    OtherIncomeTypeNodeRuleProvider getOtherIncomeTypeNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setOtherIncomeTypeNodeModule(OtherIncomeTypeNodeModule module);

        OtherIncomeTypeNodeComponent build();
    }
}
