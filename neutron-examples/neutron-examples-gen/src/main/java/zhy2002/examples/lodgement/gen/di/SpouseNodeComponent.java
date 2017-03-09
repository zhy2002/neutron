package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@SpouseNodeScope
@Subcomponent(modules = {SpouseNodeModule.class})
public interface SpouseNodeComponent {

    SpouseNodeRuleProvider getSpouseNodeRuleProvider();
    Map<String, RuleProvider<SpouseNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setSpouseNodeModule(SpouseNodeModule module);

        SpouseNodeComponent build();
    }
}
