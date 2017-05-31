package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;

@ComponentScope
@Subcomponent(modules = {TrustBeneficiaryClassNodeModule.class})
public interface TrustBeneficiaryClassNodeComponent {

    RuleProvider<TrustBeneficiaryClassNode> getTrustBeneficiaryClassNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setTrustBeneficiaryClassNodeModule(TrustBeneficiaryClassNodeModule module);

        TrustBeneficiaryClassNodeComponent build();
    }
}
