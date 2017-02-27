package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@ThirdPartyTypeNodeScope
@Subcomponent(modules = {ThirdPartyTypeNodeModule.class})
public interface ThirdPartyTypeNodeComponent {

    ThirdPartyTypeNodeRuleProvider getThirdPartyTypeNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setThirdPartyTypeNodeModule(ThirdPartyTypeNodeModule module);

        ThirdPartyTypeNodeComponent build();
    }
}
