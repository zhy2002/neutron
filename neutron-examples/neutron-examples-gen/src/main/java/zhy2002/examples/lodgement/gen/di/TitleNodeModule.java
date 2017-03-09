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

    @Provides @TitleNodeScope @Owner TitleNode provideTitleNode() {
        return owner;
    }

    @Provides @TitleNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @TitleNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @TitleNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @TitleNodeScope PersonGeneralNode providePersonGeneralNode() {
        return owner.getParent();
    }

    @Provides @TitleNodeScope
    Map<String, RuleProvider<TitleNode>> provideInstanceProviders(
        Provider<PersonGeneralNodeChildProvider.TitleNodeRuleProvider> titleNodeRuleProvider
    ) {
        Map<String, RuleProvider<TitleNode>> result = new HashMap<>();
        result.put("titleNode", titleNodeRuleProvider.get());
        return result;
    }
}