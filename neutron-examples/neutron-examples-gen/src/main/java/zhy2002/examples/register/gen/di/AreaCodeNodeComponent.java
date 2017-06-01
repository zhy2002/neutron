package zhy2002.examples.register.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.register.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ComponentScope
@Subcomponent(modules = {AreaCodeNodeModule.class})
public interface AreaCodeNodeComponent {


    RuleProvider<AreaCodeNode> getAreaCodeNodeRuleProvider();
    Map<String, RuleProvider<AreaCodeNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setAreaCodeNodeModule(AreaCodeNodeModule module);

        AreaCodeNodeComponent build();
    }

}
