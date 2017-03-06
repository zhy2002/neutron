package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;

@ThirdPartyTitleNodeScope
@Subcomponent(modules = {ThirdPartyTitleNodeModule.class})
public interface ThirdPartyTitleNodeComponent {

    ThirdPartyTitleNodeRuleProvider getThirdPartyTitleNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setThirdPartyTitleNodeModule(ThirdPartyTitleNodeModule module);

        ThirdPartyTitleNodeComponent build();
    }
}
