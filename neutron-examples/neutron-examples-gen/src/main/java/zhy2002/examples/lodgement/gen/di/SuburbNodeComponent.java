package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ComponentScope
@Subcomponent(modules = {SuburbNodeModule.class})
public interface SuburbNodeComponent {

    RuleProvider<SuburbNode> getSuburbNodeRuleProvider();
    Map<String, RuleProvider<SuburbNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setSuburbNodeModule(SuburbNodeModule module);

        SuburbNodeComponent build();
    }
}
