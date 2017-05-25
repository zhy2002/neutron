package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class AdditionalCommentNodeModule {

    private final AdditionalCommentNode owner;

    public AdditionalCommentNodeModule(AdditionalCommentNode owner) {
        this.owner = owner;
    }

    @Provides @AdditionalCommentNodeScope @Owner AdditionalCommentNode provideAdditionalCommentNode() {
        return owner;
    }

    @Provides @AdditionalCommentNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @AdditionalCommentNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @AdditionalCommentNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @AdditionalCommentNodeScope AdditionalNode provideAdditionalNode() {
        return owner.getParent();
    }

    @Provides @AdditionalCommentNodeScope
    RuleProvider<AdditionalCommentNode> provideRuleProvider(Provider<AdditionalCommentNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @AdditionalCommentNodeScope
    Map<String, RuleProvider<AdditionalCommentNode>> provideInstanceProviderMap(
        Provider<AdditionalNodeChildProvider.AdditionalCommentNodeRuleProvider> additionalCommentNodeRuleProvider
    ) {
        Map<String, RuleProvider<AdditionalCommentNode>> result = new HashMap<>();
        result.put("additionalCommentNode", additionalCommentNodeRuleProvider.get());
        return result;
    }
}