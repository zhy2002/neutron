package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;

@ThirdPartyCompanyNameNodeScope
@Subcomponent(modules = {ThirdPartyCompanyNameNodeModule.class})
public interface ThirdPartyCompanyNameNodeComponent {

    ThirdPartyCompanyNameNodeRuleProvider getThirdPartyCompanyNameNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setThirdPartyCompanyNameNodeModule(ThirdPartyCompanyNameNodeModule module);

        ThirdPartyCompanyNameNodeComponent build();
    }
}
