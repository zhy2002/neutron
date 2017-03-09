package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@OtherAssetListNodeScope
@Subcomponent(modules = {OtherAssetListNodeModule.class})
public interface OtherAssetListNodeComponent {

    OtherAssetListNodeRuleProvider getOtherAssetListNodeRuleProvider();
    Map<String, RuleProvider<OtherAssetListNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setOtherAssetListNodeModule(OtherAssetListNodeModule module);

        OtherAssetListNodeComponent build();
    }
}
