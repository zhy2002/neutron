package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@UsedAsSecurityFlagNodeScope
@Subcomponent(modules = {UsedAsSecurityFlagNodeModule.class})
public interface UsedAsSecurityFlagNodeComponent {

    UsedAsSecurityFlagNodeRuleProvider getUsedAsSecurityFlagNodeRuleProvider();
    Map<String, RuleProvider<UsedAsSecurityFlagNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setUsedAsSecurityFlagNodeModule(UsedAsSecurityFlagNodeModule module);

        UsedAsSecurityFlagNodeComponent build();
    }
}
