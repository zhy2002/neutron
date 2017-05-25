package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@LiabilitiesNodeScope
@Subcomponent(modules = {LiabilitiesNodeModule.class})
public interface LiabilitiesNodeComponent {

    RuleProvider<LiabilitiesNode> getLiabilitiesNodeRuleProvider();
    Map<String, RuleProvider<LiabilitiesNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setLiabilitiesNodeModule(LiabilitiesNodeModule module);

        LiabilitiesNodeComponent build();
    }
}
