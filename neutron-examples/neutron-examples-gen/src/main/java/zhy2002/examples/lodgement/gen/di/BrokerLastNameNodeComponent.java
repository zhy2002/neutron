package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {BrokerLastNameNodeModule.class})
public interface BrokerLastNameNodeComponent {

    List<RuleProvider<BrokerLastNameNode>> provideRuleProviders();


    @Subcomponent.Builder
    interface Builder {

        Builder setBrokerLastNameNodeModule(BrokerLastNameNodeModule module);

        BrokerLastNameNodeComponent build();
    }

}
