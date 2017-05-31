package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ComponentScope
@Subcomponent(modules = {OwnedOutrightFlagNodeModule.class})
public interface OwnedOutrightFlagNodeComponent {

    RuleProvider<OwnedOutrightFlagNode> getOwnedOutrightFlagNodeRuleProvider();
    Map<String, RuleProvider<OwnedOutrightFlagNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setOwnedOutrightFlagNodeModule(OwnedOutrightFlagNodeModule module);

        OwnedOutrightFlagNodeComponent build();
    }
}
