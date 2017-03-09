package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@TrustBeneficiaryClassListNodeScope
@Subcomponent(modules = {TrustBeneficiaryClassListNodeModule.class})
public interface TrustBeneficiaryClassListNodeComponent {

    TrustBeneficiaryClassListNodeRuleProvider getTrustBeneficiaryClassListNodeRuleProvider();
    Map<String, RuleProvider<TrustBeneficiaryClassListNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setTrustBeneficiaryClassListNodeModule(TrustBeneficiaryClassListNodeModule module);

        TrustBeneficiaryClassListNodeComponent build();
    }
}
