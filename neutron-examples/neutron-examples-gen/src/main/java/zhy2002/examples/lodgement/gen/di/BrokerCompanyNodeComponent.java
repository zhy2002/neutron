package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@BrokerCompanyNodeScope
@Subcomponent(modules = {BrokerCompanyNodeModule.class})
public interface BrokerCompanyNodeComponent {

    BrokerCompanyNodeRuleProvider getBrokerCompanyNodeRuleProvider();
    Map<String, RuleProvider<BrokerCompanyNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setBrokerCompanyNodeModule(BrokerCompanyNodeModule module);

        BrokerCompanyNodeComponent build();
    }
}
