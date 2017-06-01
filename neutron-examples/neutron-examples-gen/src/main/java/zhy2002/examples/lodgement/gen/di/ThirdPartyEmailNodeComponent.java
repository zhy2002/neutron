package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {ThirdPartyEmailNodeModule.class})
public interface ThirdPartyEmailNodeComponent {

    List<RuleProvider<ThirdPartyEmailNode>> provideRuleProviders();


    @Subcomponent.Builder
    interface Builder {

        Builder setThirdPartyEmailNodeModule(ThirdPartyEmailNodeModule module);

        ThirdPartyEmailNodeComponent build();
    }

}
