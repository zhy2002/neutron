package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {ThirdPartyDescriptionNodeModule.class})
public interface ThirdPartyDescriptionNodeComponent {

    List<RuleProvider<ThirdPartyDescriptionNode>> provideRuleProviders();


    @Subcomponent.Builder
    interface Builder {

        Builder setThirdPartyDescriptionNodeModule(ThirdPartyDescriptionNodeModule module);

        ThirdPartyDescriptionNodeComponent build();
    }

}
