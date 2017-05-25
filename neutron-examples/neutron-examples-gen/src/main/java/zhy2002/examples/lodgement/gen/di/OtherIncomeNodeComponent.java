package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;

@OtherIncomeNodeScope
@Subcomponent(modules = {OtherIncomeNodeModule.class})
public interface OtherIncomeNodeComponent {

    RuleProvider<OtherIncomeNode> getOtherIncomeNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setOtherIncomeNodeModule(OtherIncomeNodeModule module);

        OtherIncomeNodeComponent build();
    }
}
