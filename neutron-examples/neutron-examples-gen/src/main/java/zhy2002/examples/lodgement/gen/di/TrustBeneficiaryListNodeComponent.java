package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;

@TrustBeneficiaryListNodeScope
@Subcomponent(modules = {TrustBeneficiaryListNodeModule.class})
public interface TrustBeneficiaryListNodeComponent {

    TrustBeneficiaryListNodeRuleProvider getTrustBeneficiaryListNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setTrustBeneficiaryListNodeModule(TrustBeneficiaryListNodeModule module);

        TrustBeneficiaryListNodeComponent build();
    }
}
