package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ComponentScope
@Subcomponent(modules = {BrokerCompanyNodeModule.class})
public interface BrokerCompanyNodeComponent {


    RuleProvider<BrokerCompanyNode> getBrokerCompanyNodeRuleProvider();
    Map<String, RuleProvider<BrokerCompanyNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setBrokerCompanyNodeModule(BrokerCompanyNodeModule module);

        BrokerCompanyNodeComponent build();
    }

}
