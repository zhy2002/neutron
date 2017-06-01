package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ComponentScope
@Subcomponent(modules = {AverageFlagNodeModule.class})
public interface AverageFlagNodeComponent {


    RuleProvider<AverageFlagNode> getAverageFlagNodeRuleProvider();
    Map<String, RuleProvider<AverageFlagNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setAverageFlagNodeModule(AverageFlagNodeModule module);

        AverageFlagNodeComponent build();
    }

}
