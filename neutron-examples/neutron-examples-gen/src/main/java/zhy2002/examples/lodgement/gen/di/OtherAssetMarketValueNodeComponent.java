package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ComponentScope
@Subcomponent(modules = {OtherAssetMarketValueNodeModule.class})
public interface OtherAssetMarketValueNodeComponent {


    RuleProvider<OtherAssetMarketValueNode> getOtherAssetMarketValueNodeRuleProvider();
    Map<String, RuleProvider<OtherAssetMarketValueNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setOtherAssetMarketValueNodeModule(OtherAssetMarketValueNodeModule module);

        OtherAssetMarketValueNodeComponent build();
    }

}
