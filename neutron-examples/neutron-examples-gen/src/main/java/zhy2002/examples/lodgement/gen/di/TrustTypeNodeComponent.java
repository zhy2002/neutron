package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@TrustTypeNodeScope
@Subcomponent(modules = {TrustTypeNodeModule.class})
public interface TrustTypeNodeComponent {

    TrustTypeNodeRuleProvider getTrustTypeNodeRuleProvider();
    Map<String, RuleProvider<TrustTypeNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setTrustTypeNodeModule(TrustTypeNodeModule module);

        TrustTypeNodeComponent build();
    }
}
