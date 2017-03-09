package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@PrimarySecurityFlagNodeScope
@Subcomponent(modules = {PrimarySecurityFlagNodeModule.class})
public interface PrimarySecurityFlagNodeComponent {

    PrimarySecurityFlagNodeRuleProvider getPrimarySecurityFlagNodeRuleProvider();
    Map<String, RuleProvider<PrimarySecurityFlagNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setPrimarySecurityFlagNodeModule(PrimarySecurityFlagNodeModule module);

        PrimarySecurityFlagNodeComponent build();
    }
}
