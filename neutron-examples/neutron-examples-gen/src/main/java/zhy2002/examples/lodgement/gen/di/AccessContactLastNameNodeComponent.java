package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ComponentScope
@Subcomponent(modules = {AccessContactLastNameNodeModule.class})
public interface AccessContactLastNameNodeComponent {

    RuleProvider<AccessContactLastNameNode> getAccessContactLastNameNodeRuleProvider();
    Map<String, RuleProvider<AccessContactLastNameNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setAccessContactLastNameNodeModule(AccessContactLastNameNodeModule module);

        AccessContactLastNameNodeComponent build();
    }
}
