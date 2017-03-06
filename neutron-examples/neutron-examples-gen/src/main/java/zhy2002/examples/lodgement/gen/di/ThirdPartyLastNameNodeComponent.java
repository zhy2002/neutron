package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;

@ThirdPartyLastNameNodeScope
@Subcomponent(modules = {ThirdPartyLastNameNodeModule.class})
public interface ThirdPartyLastNameNodeComponent {

    ThirdPartyLastNameNodeRuleProvider getThirdPartyLastNameNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setThirdPartyLastNameNodeModule(ThirdPartyLastNameNodeModule module);

        ThirdPartyLastNameNodeComponent build();
    }
}
