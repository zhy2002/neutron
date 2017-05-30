package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class OtherTitleNodeModule {

    private final OtherTitleNode owner;

    public OtherTitleNodeModule(OtherTitleNode owner) {
        this.owner = owner;
    }

    @Provides @OtherTitleNodeScope @Owner OtherTitleNode provideOtherTitleNode() {
        return owner;
    }

    @Provides @OtherTitleNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @OtherTitleNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @OtherTitleNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @OtherTitleNodeScope PersonGeneralNode providePersonGeneralNode() {
        return owner.getParent();
    }

    @Provides @OtherTitleNodeScope
    RuleProvider<OtherTitleNode> provideRuleProvider(Provider<OtherTitleNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @OtherTitleNodeScope
    Map<String, RuleProvider<OtherTitleNode>> provideInstanceProviderMap(
        Provider<PersonGeneralNodeChildProvider.OtherTitleNodeRuleProvider> otherTitleNodeRuleProvider
    ) {
        Map<String, RuleProvider<OtherTitleNode>> result = new HashMap<>();
        result.put("otherTitleNode", otherTitleNodeRuleProvider.get());
        return result;
    }
}