package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;

@TrustBeneficiaryClassListNodeScope
@Subcomponent(modules = {TrustBeneficiaryClassListNodeModule.class})
public interface TrustBeneficiaryClassListNodeComponent {

    TrustBeneficiaryClassListNodeRuleProvider getTrustBeneficiaryClassListNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setTrustBeneficiaryClassListNodeModule(TrustBeneficiaryClassListNodeModule module);

        TrustBeneficiaryClassListNodeComponent build();
    }
}
