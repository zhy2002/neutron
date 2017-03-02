package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@ThirdPartyFirstNameNodeScope
@Subcomponent(modules = {ThirdPartyFirstNameNodeModule.class})
public interface ThirdPartyFirstNameNodeComponent {

    ThirdPartyFirstNameNodeRuleProvider getThirdPartyFirstNameNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setThirdPartyFirstNameNodeModule(ThirdPartyFirstNameNodeModule module);

        ThirdPartyFirstNameNodeComponent build();
    }
}
