package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class AccessCompanyNameNodeModule {

    private final AccessCompanyNameNode owner;

    public AccessCompanyNameNodeModule(AccessCompanyNameNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner AccessCompanyNameNode provideAccessCompanyNameNode() {
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

    @Provides @ComponentScope AccessNode provideAccessNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<AccessCompanyNameNode> provideRuleProvider(Provider<AccessCompanyNameNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<AccessCompanyNameNode>> provideInstanceProviderMap(
        Provider<AccessNodeChildProvider.AccessCompanyNameNodeRuleProvider> accessCompanyNameNodeRuleProvider
    ) {
        Map<String, RuleProvider<AccessCompanyNameNode>> result = new HashMap<>();
        result.put("accessCompanyNameNode", accessCompanyNameNodeRuleProvider.get());
        return result;
    }
}