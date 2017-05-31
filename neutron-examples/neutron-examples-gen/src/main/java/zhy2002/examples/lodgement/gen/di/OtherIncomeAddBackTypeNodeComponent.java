package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ComponentScope
@Subcomponent(modules = {OtherIncomeAddBackTypeNodeModule.class})
public interface OtherIncomeAddBackTypeNodeComponent {

    RuleProvider<OtherIncomeAddBackTypeNode> getOtherIncomeAddBackTypeNodeRuleProvider();
    Map<String, RuleProvider<OtherIncomeAddBackTypeNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setOtherIncomeAddBackTypeNodeModule(OtherIncomeAddBackTypeNodeModule module);

        OtherIncomeAddBackTypeNodeComponent build();
    }
}
