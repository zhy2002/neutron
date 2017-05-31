package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ComponentScope
@Subcomponent(modules = {OtherAssetListNodeModule.class})
public interface OtherAssetListNodeComponent {

    RuleProvider<OtherAssetListNode> getOtherAssetListNodeRuleProvider();
    Map<String, RuleProvider<OtherAssetListNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setOtherAssetListNodeModule(OtherAssetListNodeModule module);

        OtherAssetListNodeComponent build();
    }
}
