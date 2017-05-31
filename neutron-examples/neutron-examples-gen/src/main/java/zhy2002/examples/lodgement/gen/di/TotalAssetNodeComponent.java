package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ComponentScope
@Subcomponent(modules = {TotalAssetNodeModule.class})
public interface TotalAssetNodeComponent {

    RuleProvider<TotalAssetNode> getTotalAssetNodeRuleProvider();
    Map<String, RuleProvider<TotalAssetNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setTotalAssetNodeModule(TotalAssetNodeModule module);

        TotalAssetNodeComponent build();
    }
}
