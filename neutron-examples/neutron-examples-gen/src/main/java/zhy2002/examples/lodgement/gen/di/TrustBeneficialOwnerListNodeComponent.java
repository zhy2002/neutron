package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ComponentScope
@Subcomponent(modules = {TrustBeneficialOwnerListNodeModule.class})
public interface TrustBeneficialOwnerListNodeComponent {


    RuleProvider<TrustBeneficialOwnerListNode> getTrustBeneficialOwnerListNodeRuleProvider();
    Map<String, RuleProvider<TrustBeneficialOwnerListNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setTrustBeneficialOwnerListNodeModule(TrustBeneficialOwnerListNodeModule module);

        TrustBeneficialOwnerListNodeComponent build();
    }

}
