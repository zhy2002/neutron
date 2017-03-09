package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@TotalAssetNodeScope
@Subcomponent(modules = {TotalAssetNodeModule.class})
public interface TotalAssetNodeComponent {

    TotalAssetNodeRuleProvider getTotalAssetNodeRuleProvider();
    Map<String, RuleProvider<TotalAssetNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setTotalAssetNodeModule(TotalAssetNodeModule module);

        TotalAssetNodeComponent build();
    }
}
