package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ThirdPartyCompanyNameNodeScope
@Subcomponent(modules = {ThirdPartyCompanyNameNodeModule.class})
public interface ThirdPartyCompanyNameNodeComponent {

    ThirdPartyCompanyNameNodeRuleProvider getThirdPartyCompanyNameNodeRuleProvider();
    Map<String, RuleProvider<ThirdPartyCompanyNameNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setThirdPartyCompanyNameNodeModule(ThirdPartyCompanyNameNodeModule module);

        ThirdPartyCompanyNameNodeComponent build();
    }
}
