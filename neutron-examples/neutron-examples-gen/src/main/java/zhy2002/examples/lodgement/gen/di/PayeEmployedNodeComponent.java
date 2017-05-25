package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@PayeEmployedNodeScope
@Subcomponent(modules = {PayeEmployedNodeModule.class})
public interface PayeEmployedNodeComponent {

    RuleProvider<PayeEmployedNode> getPayeEmployedNodeRuleProvider();
    Map<String, RuleProvider<PayeEmployedNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setPayeEmployedNodeModule(PayeEmployedNodeModule module);

        PayeEmployedNodeComponent build();
    }
}
