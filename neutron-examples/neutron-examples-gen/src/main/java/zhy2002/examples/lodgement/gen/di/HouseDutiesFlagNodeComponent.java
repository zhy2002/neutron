package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@HouseDutiesFlagNodeScope
@Subcomponent(modules = {HouseDutiesFlagNodeModule.class})
public interface HouseDutiesFlagNodeComponent {

    HouseDutiesFlagNodeRuleProvider getHouseDutiesFlagNodeRuleProvider();
    Map<String, RuleProvider<HouseDutiesFlagNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setHouseDutiesFlagNodeModule(HouseDutiesFlagNodeModule module);

        HouseDutiesFlagNodeComponent build();
    }
}
