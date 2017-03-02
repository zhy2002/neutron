package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@ThirdPartyDobNodeScope
@Subcomponent(modules = {ThirdPartyDobNodeModule.class})
public interface ThirdPartyDobNodeComponent {

    ThirdPartyDobNodeRuleProvider getThirdPartyDobNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setThirdPartyDobNodeModule(ThirdPartyDobNodeModule module);

        ThirdPartyDobNodeComponent build();
    }
}
