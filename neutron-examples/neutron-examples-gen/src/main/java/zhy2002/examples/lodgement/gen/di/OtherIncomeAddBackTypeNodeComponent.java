package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@OtherIncomeAddBackTypeNodeScope
@Subcomponent(modules = {OtherIncomeAddBackTypeNodeModule.class})
public interface OtherIncomeAddBackTypeNodeComponent {

    OtherIncomeAddBackTypeNodeRuleProvider getOtherIncomeAddBackTypeNodeRuleProvider();
    Map<String, RuleProvider<OtherIncomeAddBackTypeNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setOtherIncomeAddBackTypeNodeModule(OtherIncomeAddBackTypeNodeModule module);

        OtherIncomeAddBackTypeNodeComponent build();
    }
}
