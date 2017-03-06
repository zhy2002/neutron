package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;

@TotalAssetNodeScope
@Subcomponent(modules = {TotalAssetNodeModule.class})
public interface TotalAssetNodeComponent {

    TotalAssetNodeRuleProvider getTotalAssetNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setTotalAssetNodeModule(TotalAssetNodeModule module);

        TotalAssetNodeComponent build();
    }
}
