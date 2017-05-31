package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ComponentScope
@Subcomponent(modules = {NextOfKinNodeModule.class})
public interface NextOfKinNodeComponent {

    RuleProvider<NextOfKinNode> getNextOfKinNodeRuleProvider();
    Map<String, RuleProvider<NextOfKinNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setNextOfKinNodeModule(NextOfKinNodeModule module);

        NextOfKinNodeComponent build();
    }
}
