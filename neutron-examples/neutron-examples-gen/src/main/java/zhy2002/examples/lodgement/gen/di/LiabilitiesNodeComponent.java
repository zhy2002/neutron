package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@LiabilitiesNodeScope
@Subcomponent(modules = {LiabilitiesNodeModule.class})
public interface LiabilitiesNodeComponent {

    LiabilitiesNodeRuleProvider getLiabilitiesNodeRuleProvider();
    Map<String, RuleProvider<LiabilitiesNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setLiabilitiesNodeModule(LiabilitiesNodeModule module);

        LiabilitiesNodeComponent build();
    }
}
