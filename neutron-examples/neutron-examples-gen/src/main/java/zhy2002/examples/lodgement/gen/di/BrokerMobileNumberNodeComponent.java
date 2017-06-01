package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {BrokerMobileNumberNodeModule.class})
public interface BrokerMobileNumberNodeComponent {

    List<RuleProvider<BrokerMobileNumberNode>> provideRuleProviders();


    @Subcomponent.Builder
    interface Builder {

        Builder setBrokerMobileNumberNodeModule(BrokerMobileNumberNodeModule module);

        BrokerMobileNumberNodeComponent build();
    }

}
