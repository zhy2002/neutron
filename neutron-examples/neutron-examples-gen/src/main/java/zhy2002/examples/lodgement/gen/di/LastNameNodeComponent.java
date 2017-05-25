package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@LastNameNodeScope
@Subcomponent(modules = {LastNameNodeModule.class})
public interface LastNameNodeComponent {

    RuleProvider<LastNameNode> getLastNameNodeRuleProvider();
    Map<String, RuleProvider<LastNameNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setLastNameNodeModule(LastNameNodeModule module);

        LastNameNodeComponent build();
    }
}
