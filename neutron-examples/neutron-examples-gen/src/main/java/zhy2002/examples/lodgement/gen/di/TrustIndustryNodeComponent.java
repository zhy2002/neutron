package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;

@TrustIndustryNodeScope
@Subcomponent(modules = {TrustIndustryNodeModule.class})
public interface TrustIndustryNodeComponent {

    TrustIndustryNodeRuleProvider getTrustIndustryNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setTrustIndustryNodeModule(TrustIndustryNodeModule module);

        TrustIndustryNodeComponent build();
    }
}
