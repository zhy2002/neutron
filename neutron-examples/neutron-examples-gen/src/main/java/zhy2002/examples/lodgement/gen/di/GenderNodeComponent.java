package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@GenderNodeScope
@Subcomponent(modules = {GenderNodeModule.class})
public interface GenderNodeComponent {

    GenderNodeRuleProvider getGenderNodeRuleProvider();
    Map<String, RuleProvider<GenderNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setGenderNodeModule(GenderNodeModule module);

        GenderNodeComponent build();
    }
}
