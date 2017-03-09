package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@OwnedOutrightFlagNodeScope
@Subcomponent(modules = {OwnedOutrightFlagNodeModule.class})
public interface OwnedOutrightFlagNodeComponent {

    OwnedOutrightFlagNodeRuleProvider getOwnedOutrightFlagNodeRuleProvider();
    Map<String, RuleProvider<OwnedOutrightFlagNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setOwnedOutrightFlagNodeModule(OwnedOutrightFlagNodeModule module);

        OwnedOutrightFlagNodeComponent build();
    }
}
