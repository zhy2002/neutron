package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {TrustBeneficiaryClassListNodeModule.class})
public interface TrustBeneficiaryClassListNodeComponent {

    List<RuleProvider<TrustBeneficiaryClassListNode>> provideRuleProviders();

    TrustBeneficiaryClassNode createTrustBeneficiaryClassNode();

    @Subcomponent.Builder
    interface Builder {

        Builder setTrustBeneficiaryClassListNodeModule(TrustBeneficiaryClassListNodeModule module);

        TrustBeneficiaryClassListNodeComponent build();
    }

}
