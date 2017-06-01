package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ComponentScope
@Subcomponent(modules = {TrustSettlorListNodeModule.class})
public interface TrustSettlorListNodeComponent {


    RuleProvider<TrustSettlorListNode> getTrustSettlorListNodeRuleProvider();
    Map<String, RuleProvider<TrustSettlorListNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setTrustSettlorListNodeModule(TrustSettlorListNodeModule module);

        TrustSettlorListNodeComponent build();
    }

}
