package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@FirstNameNodeScope
@Subcomponent(modules = {FirstNameNodeModule.class})
public interface FirstNameNodeComponent {

    FirstNameNodeRuleProvider getFirstNameNodeRuleProvider();
    Map<String, RuleProvider<FirstNameNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setFirstNameNodeModule(FirstNameNodeModule module);

        FirstNameNodeComponent build();
    }
}
