package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;

@TrustBeneficiaryClassNodeScope
@Subcomponent(modules = {TrustBeneficiaryClassNodeModule.class})
public interface TrustBeneficiaryClassNodeComponent {

    TrustBeneficiaryClassNodeRuleProvider getTrustBeneficiaryClassNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setTrustBeneficiaryClassNodeModule(TrustBeneficiaryClassNodeModule module);

        TrustBeneficiaryClassNodeComponent build();
    }
}
