package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@EstimatedMarketValueNodeScope
@Subcomponent(modules = {EstimatedMarketValueNodeModule.class})
public interface EstimatedMarketValueNodeComponent {

    RuleProvider<EstimatedMarketValueNode> getEstimatedMarketValueNodeRuleProvider();
    Map<String, RuleProvider<EstimatedMarketValueNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setEstimatedMarketValueNodeModule(EstimatedMarketValueNodeModule module);

        EstimatedMarketValueNodeComponent build();
    }
}
