package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class ThirdPartyCompanyNameNodeModule {

    private final ThirdPartyCompanyNameNode owner;

    public ThirdPartyCompanyNameNodeModule(ThirdPartyCompanyNameNode owner) {
        this.owner = owner;
    }

    @Provides @ThirdPartyCompanyNameNodeScope @Owner ThirdPartyCompanyNameNode provideThirdPartyCompanyNameNode() {
        return owner;
    }

    @Provides @ThirdPartyCompanyNameNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @ThirdPartyCompanyNameNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @ThirdPartyCompanyNameNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ThirdPartyCompanyNameNodeScope RelatedPartyNode provideRelatedPartyNode() {
        return owner.getParent();
    }

    @Provides @ThirdPartyCompanyNameNodeScope
    Map<String, RuleProvider<ThirdPartyCompanyNameNode>> provideInstanceProviders(
        Provider<RelatedPartyNodeChildProvider.ThirdPartyCompanyNameNodeRuleProvider> thirdPartyCompanyNameNodeRuleProvider
    ) {
        Map<String, RuleProvider<ThirdPartyCompanyNameNode>> result = new HashMap<>();
        result.put("thirdPartyCompanyNameNode", thirdPartyCompanyNameNodeRuleProvider.get());
        return result;
    }
}