package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {ThirdPartyTypeNodeModule.class})
public interface ThirdPartyTypeNodeComponent {

    List<RuleProvider<ThirdPartyTypeNode>> provideRuleProviders();


    @Subcomponent.Builder
    interface Builder {

        Builder setThirdPartyTypeNodeModule(ThirdPartyTypeNodeModule module);

        ThirdPartyTypeNodeComponent build();
    }

}
