package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@ThirdPartyEmailNodeScope
@Subcomponent(modules = {ThirdPartyEmailNodeModule.class})
public interface ThirdPartyEmailNodeComponent {

    ThirdPartyEmailNodeRuleProvider getThirdPartyEmailNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setThirdPartyEmailNodeModule(ThirdPartyEmailNodeModule module);

        ThirdPartyEmailNodeComponent build();
    }
}
