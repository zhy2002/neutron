package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@PermanentResidentFlagNodeScope
@Subcomponent(modules = {PermanentResidentFlagNodeModule.class})
public interface PermanentResidentFlagNodeComponent {

    RuleProvider<PermanentResidentFlagNode> getPermanentResidentFlagNodeRuleProvider();
    Map<String, RuleProvider<PermanentResidentFlagNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setPermanentResidentFlagNodeModule(PermanentResidentFlagNodeModule module);

        PermanentResidentFlagNodeComponent build();
    }
}
