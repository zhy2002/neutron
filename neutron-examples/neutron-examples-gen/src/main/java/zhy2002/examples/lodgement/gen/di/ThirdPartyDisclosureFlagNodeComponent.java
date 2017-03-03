package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@ThirdPartyDisclosureFlagNodeScope
@Subcomponent(modules = {ThirdPartyDisclosureFlagNodeModule.class})
public interface ThirdPartyDisclosureFlagNodeComponent {

    ThirdPartyDisclosureFlagNodeRuleProvider getThirdPartyDisclosureFlagNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setThirdPartyDisclosureFlagNodeModule(ThirdPartyDisclosureFlagNodeModule module);

        ThirdPartyDisclosureFlagNodeComponent build();
    }
}
