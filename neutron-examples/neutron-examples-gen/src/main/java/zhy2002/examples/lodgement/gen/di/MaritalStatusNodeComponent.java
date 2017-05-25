package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@MaritalStatusNodeScope
@Subcomponent(modules = {MaritalStatusNodeModule.class})
public interface MaritalStatusNodeComponent {

    RuleProvider<MaritalStatusNode> getMaritalStatusNodeRuleProvider();
    Map<String, RuleProvider<MaritalStatusNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setMaritalStatusNodeModule(MaritalStatusNodeModule module);

        MaritalStatusNodeComponent build();
    }
}
