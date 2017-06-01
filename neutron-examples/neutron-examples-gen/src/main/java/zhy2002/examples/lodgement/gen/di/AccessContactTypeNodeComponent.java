package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ComponentScope
@Subcomponent(modules = {AccessContactTypeNodeModule.class})
public interface AccessContactTypeNodeComponent {


    RuleProvider<AccessContactTypeNode> getAccessContactTypeNodeRuleProvider();
    Map<String, RuleProvider<AccessContactTypeNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setAccessContactTypeNodeModule(AccessContactTypeNodeModule module);

        AccessContactTypeNodeComponent build();
    }

}
