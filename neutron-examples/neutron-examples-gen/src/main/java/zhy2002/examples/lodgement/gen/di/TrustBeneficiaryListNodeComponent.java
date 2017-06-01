package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ComponentScope
@Subcomponent(modules = {TrustBeneficiaryListNodeModule.class})
public interface TrustBeneficiaryListNodeComponent extends SelectRelatedPersonListNodeComponent {


    RuleProvider<TrustBeneficiaryListNode> getTrustBeneficiaryListNodeRuleProvider();
    Map<String, RuleProvider<TrustBeneficiaryListNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setTrustBeneficiaryListNodeModule(TrustBeneficiaryListNodeModule module);

        TrustBeneficiaryListNodeComponent build();
    }

}
