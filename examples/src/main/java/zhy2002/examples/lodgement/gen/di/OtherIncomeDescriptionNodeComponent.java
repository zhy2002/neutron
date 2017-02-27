package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@OtherIncomeDescriptionNodeScope
@Subcomponent(modules = {OtherIncomeDescriptionNodeModule.class})
public interface OtherIncomeDescriptionNodeComponent {

    OtherIncomeDescriptionNodeRuleProvider getOtherIncomeDescriptionNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setOtherIncomeDescriptionNodeModule(OtherIncomeDescriptionNodeModule module);

        OtherIncomeDescriptionNodeComponent build();
    }
}
