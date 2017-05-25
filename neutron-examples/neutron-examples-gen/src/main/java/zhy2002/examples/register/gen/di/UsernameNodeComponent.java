package zhy2002.examples.register.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.register.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@UsernameNodeScope
@Subcomponent(modules = {UsernameNodeModule.class})
public interface UsernameNodeComponent {

    RuleProvider<UsernameNode> getUsernameNodeRuleProvider();
    Map<String, RuleProvider<UsernameNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setUsernameNodeModule(UsernameNodeModule module);

        UsernameNodeComponent build();
    }
}
