package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;

@EstimatedMarketValueNodeScope
@Subcomponent(modules = {EstimatedMarketValueNodeModule.class})
public interface EstimatedMarketValueNodeComponent {

    EstimatedMarketValueNodeRuleProvider getEstimatedMarketValueNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setEstimatedMarketValueNodeModule(EstimatedMarketValueNodeModule module);

        EstimatedMarketValueNodeComponent build();
    }
}
