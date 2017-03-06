package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;

@TrustCountryNodeScope
@Subcomponent(modules = {TrustCountryNodeModule.class})
public interface TrustCountryNodeComponent {

    TrustCountryNodeRuleProvider getTrustCountryNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setTrustCountryNodeModule(TrustCountryNodeModule module);

        TrustCountryNodeComponent build();
    }
}
