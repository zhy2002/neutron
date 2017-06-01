package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {LenderIssuedBrokerNumberNodeModule.class})
public interface LenderIssuedBrokerNumberNodeComponent {

    List<RuleProvider<LenderIssuedBrokerNumberNode>> provideRuleProviders();


    @Subcomponent.Builder
    interface Builder {

        Builder setLenderIssuedBrokerNumberNodeModule(LenderIssuedBrokerNumberNodeModule module);

        LenderIssuedBrokerNumberNodeComponent build();
    }

}
