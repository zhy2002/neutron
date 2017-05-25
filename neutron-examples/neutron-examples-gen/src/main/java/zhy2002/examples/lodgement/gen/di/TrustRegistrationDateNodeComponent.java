package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@TrustRegistrationDateNodeScope
@Subcomponent(modules = {TrustRegistrationDateNodeModule.class})
public interface TrustRegistrationDateNodeComponent {

    RuleProvider<TrustRegistrationDateNode> getTrustRegistrationDateNodeRuleProvider();
    Map<String, RuleProvider<TrustRegistrationDateNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setTrustRegistrationDateNodeModule(TrustRegistrationDateNodeModule module);

        TrustRegistrationDateNodeComponent build();
    }
}
