package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {ThirdPartyFirstNameNodeModule.class})
public interface ThirdPartyFirstNameNodeComponent {

    List<RuleProvider<ThirdPartyFirstNameNode>> provideRuleProviders();


    @Subcomponent.Builder
    interface Builder {

        Builder setThirdPartyFirstNameNodeModule(ThirdPartyFirstNameNodeModule module);

        ThirdPartyFirstNameNodeComponent build();
    }

}
