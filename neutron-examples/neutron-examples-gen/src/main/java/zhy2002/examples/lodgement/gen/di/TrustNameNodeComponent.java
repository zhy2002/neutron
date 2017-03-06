package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;

@TrustNameNodeScope
@Subcomponent(modules = {TrustNameNodeModule.class})
public interface TrustNameNodeComponent {

    TrustNameNodeRuleProvider getTrustNameNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setTrustNameNodeModule(TrustNameNodeModule module);

        TrustNameNodeComponent build();
    }
}
