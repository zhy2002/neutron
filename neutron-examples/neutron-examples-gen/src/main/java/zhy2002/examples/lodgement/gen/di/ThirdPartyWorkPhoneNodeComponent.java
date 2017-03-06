package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;

@ThirdPartyWorkPhoneNodeScope
@Subcomponent(modules = {ThirdPartyWorkPhoneNodeModule.class})
public interface ThirdPartyWorkPhoneNodeComponent {

    ThirdPartyWorkPhoneNodeRuleProvider getThirdPartyWorkPhoneNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setThirdPartyWorkPhoneNodeModule(ThirdPartyWorkPhoneNodeModule module);

        ThirdPartyWorkPhoneNodeComponent build();
    }
}
