package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class TitleNodeModule {

    private final TitleNode owner;

    public TitleNodeModule(TitleNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner TitleNode provideTitleNode() {
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

    @Provides @ChildName String provideChildName() {
        return owner.getContext().getNameOfNodeBeingCreated();
    }

    @Provides @ComponentScope PersonGeneralNode providePersonGeneralNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<TitleNode> provideRuleProvider(Provider<TitleNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<TitleNode>> provideInstanceProviderMap(
        Provider<PersonGeneralNodeChildProvider.TitleNodeRuleProvider> titleNodeRuleProvider
    ) {
        Map<String, RuleProvider<TitleNode>> result = new HashMap<>();
        result.put("titleNode", titleNodeRuleProvider.get());
        return result;
    }
}