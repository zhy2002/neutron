package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@AssetsNodeScope
@Subcomponent(modules = {AssetsNodeModule.class})
public interface AssetsNodeComponent {

    AssetsNodeRuleProvider getAssetsNodeRuleProvider();
    Map<String, RuleProvider<AssetsNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setAssetsNodeModule(AssetsNodeModule module);

        AssetsNodeComponent build();
    }
}
