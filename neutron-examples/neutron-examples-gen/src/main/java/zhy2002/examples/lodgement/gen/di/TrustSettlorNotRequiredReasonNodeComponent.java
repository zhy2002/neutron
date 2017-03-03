package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@TrustSettlorNotRequiredReasonNodeScope
@Subcomponent(modules = {TrustSettlorNotRequiredReasonNodeModule.class})
public interface TrustSettlorNotRequiredReasonNodeComponent {

    TrustSettlorNotRequiredReasonNodeRuleProvider getTrustSettlorNotRequiredReasonNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setTrustSettlorNotRequiredReasonNodeModule(TrustSettlorNotRequiredReasonNodeModule module);

        TrustSettlorNotRequiredReasonNodeComponent build();
    }
}
