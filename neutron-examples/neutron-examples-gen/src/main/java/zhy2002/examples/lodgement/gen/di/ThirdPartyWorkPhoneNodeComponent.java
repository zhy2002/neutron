package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {ThirdPartyWorkPhoneNodeModule.class})
public interface ThirdPartyWorkPhoneNodeComponent {

    List<RuleProvider<ThirdPartyWorkPhoneNode>> provideRuleProviders();


    @Subcomponent.Builder
    interface Builder {

        Builder setThirdPartyWorkPhoneNodeModule(ThirdPartyWorkPhoneNodeModule module);

        ThirdPartyWorkPhoneNodeComponent build();
    }

}
