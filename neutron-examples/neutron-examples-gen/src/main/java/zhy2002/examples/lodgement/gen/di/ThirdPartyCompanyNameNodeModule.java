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

    @Provides @ComponentScope @Owner ThirdPartyCompanyNameNode provideThirdPartyCompanyNameNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ComponentScope RelatedPartyNode provideRelatedPartyNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<ThirdPartyCompanyNameNode> provideRuleProvider(Provider<ThirdPartyCompanyNameNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<ThirdPartyCompanyNameNode>> provideInstanceProviderMap(
        Provider<RelatedPartyNodeChildProvider.ThirdPartyCompanyNameNodeRuleProvider> thirdPartyCompanyNameNodeRuleProvider
    ) {
        Map<String, RuleProvider<ThirdPartyCompanyNameNode>> result = new HashMap<>();
        result.put("thirdPartyCompanyNameNode", thirdPartyCompanyNameNodeRuleProvider.get());
        return result;
    }
}