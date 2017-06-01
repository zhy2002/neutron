package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {EstimatedMarketValueNodeModule.class})
public interface EstimatedMarketValueNodeComponent {

    List<RuleProvider<EstimatedMarketValueNode>> provideRuleProviders();


    @Subcomponent.Builder
    interface Builder {

        Builder setEstimatedMarketValueNodeModule(EstimatedMarketValueNodeModule module);

        EstimatedMarketValueNodeComponent build();
    }

}
