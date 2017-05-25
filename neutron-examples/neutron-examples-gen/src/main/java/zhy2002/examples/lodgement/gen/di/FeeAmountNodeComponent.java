package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@FeeAmountNodeScope
@Subcomponent(modules = {FeeAmountNodeModule.class})
public interface FeeAmountNodeComponent {

    RuleProvider<FeeAmountNode> getFeeAmountNodeRuleProvider();
    Map<String, RuleProvider<FeeAmountNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setFeeAmountNodeModule(FeeAmountNodeModule module);

        FeeAmountNodeComponent build();
    }
}
