package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;

@ThirdPartyDescriptionNodeScope
@Subcomponent(modules = {ThirdPartyDescriptionNodeModule.class})
public interface ThirdPartyDescriptionNodeComponent {

    ThirdPartyDescriptionNodeRuleProvider getThirdPartyDescriptionNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setThirdPartyDescriptionNodeModule(ThirdPartyDescriptionNodeModule module);

        ThirdPartyDescriptionNodeComponent build();
    }
}
