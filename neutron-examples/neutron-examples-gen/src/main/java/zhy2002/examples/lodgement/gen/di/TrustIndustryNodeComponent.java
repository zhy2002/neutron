package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {TrustIndustryNodeModule.class})
public interface TrustIndustryNodeComponent {

    List<RuleProvider<TrustIndustryNode>> provideRuleProviders();


    @Subcomponent.Builder
    interface Builder {

        Builder setTrustIndustryNodeModule(TrustIndustryNodeModule module);

        TrustIndustryNodeComponent build();
    }

}
