package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class PostcodeNodeModule {

    private final PostcodeNode owner;

    public PostcodeNodeModule(PostcodeNode owner) {
        this.owner = owner;
    }

    @Provides @PostcodeNodeScope @Owner PostcodeNode providePostcodeNode() {
        return owner;
    }

    @Provides @PostcodeNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @PostcodeNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @PostcodeNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @PostcodeNodeScope AddressNode<?> provideAddressNode() {
        return owner.getParent();
    }

    @Provides @PostcodeNodeScope
    RuleProvider<PostcodeNode> provideRuleProvider(Provider<PostcodeNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @PostcodeNodeScope
    Map<String, RuleProvider<PostcodeNode>> provideInstanceProviderMap(
        Provider<AddressNodeChildProvider.PostcodeNodeRuleProvider> postcodeNodeRuleProvider
    ) {
        Map<String, RuleProvider<PostcodeNode>> result = new HashMap<>();
        result.put("postcodeNode", postcodeNodeRuleProvider.get());
        return result;
    }
}