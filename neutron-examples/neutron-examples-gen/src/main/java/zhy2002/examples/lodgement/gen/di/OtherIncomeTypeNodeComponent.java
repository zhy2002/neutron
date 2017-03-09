package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@OtherIncomeTypeNodeScope
@Subcomponent(modules = {OtherIncomeTypeNodeModule.class})
public interface OtherIncomeTypeNodeComponent {

    OtherIncomeTypeNodeRuleProvider getOtherIncomeTypeNodeRuleProvider();
    Map<String, RuleProvider<OtherIncomeTypeNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setOtherIncomeTypeNodeModule(OtherIncomeTypeNodeModule module);

        OtherIncomeTypeNodeComponent build();
    }
}
