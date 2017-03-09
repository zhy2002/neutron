package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@TrustBeneficiaryListNodeScope
@Subcomponent(modules = {TrustBeneficiaryListNodeModule.class})
public interface TrustBeneficiaryListNodeComponent {

    TrustBeneficiaryListNodeRuleProvider getTrustBeneficiaryListNodeRuleProvider();
    Map<String, RuleProvider<TrustBeneficiaryListNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setTrustBeneficiaryListNodeModule(TrustBeneficiaryListNodeModule module);

        TrustBeneficiaryListNodeComponent build();
    }
}
