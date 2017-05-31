package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ComponentScope
@Subcomponent(modules = {RetiredSinceNodeModule.class})
public interface RetiredSinceNodeComponent {

    RuleProvider<RetiredSinceNode> getRetiredSinceNodeRuleProvider();
    Map<String, RuleProvider<RetiredSinceNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setRetiredSinceNodeModule(RetiredSinceNodeModule module);

        RetiredSinceNodeComponent build();
    }
}
