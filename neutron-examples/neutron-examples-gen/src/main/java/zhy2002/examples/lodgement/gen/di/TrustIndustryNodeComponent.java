package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@TrustIndustryNodeScope
@Subcomponent(modules = {TrustIndustryNodeModule.class})
public interface TrustIndustryNodeComponent {

    TrustIndustryNodeRuleProvider getTrustIndustryNodeRuleProvider();
    Map<String, RuleProvider<TrustIndustryNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setTrustIndustryNodeModule(TrustIndustryNodeModule module);

        TrustIndustryNodeComponent build();
    }
}
