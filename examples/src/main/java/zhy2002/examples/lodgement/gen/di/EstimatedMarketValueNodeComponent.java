package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

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
