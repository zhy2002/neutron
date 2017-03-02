package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@TrustTypeNodeScope
@Subcomponent(modules = {TrustTypeNodeModule.class})
public interface TrustTypeNodeComponent {

    TrustTypeNodeRuleProvider getTrustTypeNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setTrustTypeNodeModule(TrustTypeNodeModule module);

        TrustTypeNodeComponent build();
    }
}
