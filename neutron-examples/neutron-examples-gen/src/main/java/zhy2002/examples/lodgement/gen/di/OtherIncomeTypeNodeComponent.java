package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@OtherIncomeTypeNodeScope
@Subcomponent(modules = {OtherIncomeTypeNodeModule.class})
public interface OtherIncomeTypeNodeComponent {

    RuleProvider<OtherIncomeTypeNode> getOtherIncomeTypeNodeRuleProvider();
    Map<String, RuleProvider<OtherIncomeTypeNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setOtherIncomeTypeNodeModule(OtherIncomeTypeNodeModule module);

        OtherIncomeTypeNodeComponent build();
    }
}
