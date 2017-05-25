package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@AccessNodeScope
@Subcomponent(modules = {AccessNodeModule.class})
public interface AccessNodeComponent {

    RuleProvider<AccessNode> getAccessNodeRuleProvider();
    Map<String, RuleProvider<AccessNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setAccessNodeModule(AccessNodeModule module);

        AccessNodeComponent build();
    }
}
