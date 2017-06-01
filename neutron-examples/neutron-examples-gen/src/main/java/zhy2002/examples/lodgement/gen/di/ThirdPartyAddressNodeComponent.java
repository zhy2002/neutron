package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {ThirdPartyAddressNodeModule.class})
public interface ThirdPartyAddressNodeComponent extends AddressNodeComponent {

    List<RuleProvider<ThirdPartyAddressNode>> provideRuleProviders();


    @Subcomponent.Builder
    interface Builder {

        Builder setThirdPartyAddressNodeModule(ThirdPartyAddressNodeModule module);

        ThirdPartyAddressNodeComponent build();
    }

}
