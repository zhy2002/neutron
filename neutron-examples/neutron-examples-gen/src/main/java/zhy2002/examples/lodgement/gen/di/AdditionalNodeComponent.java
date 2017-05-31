package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ComponentScope
@Subcomponent(modules = {AdditionalNodeModule.class})
public interface AdditionalNodeComponent {

    RuleProvider<AdditionalNode> getAdditionalNodeRuleProvider();
    Map<String, RuleProvider<AdditionalNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setAdditionalNodeModule(AdditionalNodeModule module);

        AdditionalNodeComponent build();
    }
}
