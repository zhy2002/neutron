package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@PayeEmployedNodeScope
@Subcomponent(modules = {PayeEmployedNodeModule.class})
public interface PayeEmployedNodeComponent {

    PayeEmployedNodeRuleProvider getPayeEmployedNodeRuleProvider();
    Map<String, RuleProvider<PayeEmployedNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setPayeEmployedNodeModule(PayeEmployedNodeModule module);

        PayeEmployedNodeComponent build();
    }
}
