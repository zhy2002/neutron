package zhy2002.examples.register.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.register.gen.*;
import zhy2002.examples.register.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@AgeNodeScope
@Subcomponent(modules = {AgeNodeModule.class})
public interface AgeNodeComponent {

    AgeNodeRuleProvider getAgeNodeRuleProvider();
    Map<String, RuleProvider<AgeNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setAgeNodeModule(AgeNodeModule module);

        AgeNodeComponent build();
    }
}
