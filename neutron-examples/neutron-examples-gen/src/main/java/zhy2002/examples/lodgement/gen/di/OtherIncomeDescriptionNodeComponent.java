package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ComponentScope
@Subcomponent(modules = {OtherIncomeDescriptionNodeModule.class})
public interface OtherIncomeDescriptionNodeComponent {

    RuleProvider<OtherIncomeDescriptionNode> getOtherIncomeDescriptionNodeRuleProvider();
    Map<String, RuleProvider<OtherIncomeDescriptionNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setOtherIncomeDescriptionNodeModule(OtherIncomeDescriptionNodeModule module);

        OtherIncomeDescriptionNodeComponent build();
    }
}
