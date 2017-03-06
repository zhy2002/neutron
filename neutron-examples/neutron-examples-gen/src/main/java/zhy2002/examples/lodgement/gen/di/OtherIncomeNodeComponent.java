package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;

@OtherIncomeNodeScope
@Subcomponent(modules = {OtherIncomeNodeModule.class})
public interface OtherIncomeNodeComponent {

    OtherIncomeNodeRuleProvider getOtherIncomeNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setOtherIncomeNodeModule(OtherIncomeNodeModule module);

        OtherIncomeNodeComponent build();
    }
}
