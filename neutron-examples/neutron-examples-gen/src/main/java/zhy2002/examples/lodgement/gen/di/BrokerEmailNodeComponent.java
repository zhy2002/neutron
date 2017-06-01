package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {BrokerEmailNodeModule.class})
public interface BrokerEmailNodeComponent {

    List<RuleProvider<BrokerEmailNode>> provideRuleProviders();


    @Subcomponent.Builder
    interface Builder {

        Builder setBrokerEmailNodeModule(BrokerEmailNodeModule module);

        BrokerEmailNodeComponent build();
    }

}
