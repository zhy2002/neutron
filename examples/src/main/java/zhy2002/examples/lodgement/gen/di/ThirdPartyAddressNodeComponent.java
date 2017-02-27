package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@ThirdPartyAddressNodeScope
@Subcomponent(modules = {ThirdPartyAddressNodeModule.class})
public interface ThirdPartyAddressNodeComponent {

    ThirdPartyAddressNodeRuleProvider getThirdPartyAddressNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setThirdPartyAddressNodeModule(ThirdPartyAddressNodeModule module);

        ThirdPartyAddressNodeComponent build();
    }
}
