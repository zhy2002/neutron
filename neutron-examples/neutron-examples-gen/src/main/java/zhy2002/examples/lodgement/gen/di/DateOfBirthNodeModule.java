package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class DateOfBirthNodeModule {

    private final DateOfBirthNode owner;

    public DateOfBirthNodeModule(DateOfBirthNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner DateOfBirthNode provideDateOfBirthNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner DobNode<?> provideDobNode() {
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

    @Provides @ComponentScope PersonGeneralNode providePersonGeneralNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<DateOfBirthNode> provideRuleProvider(Provider<DateOfBirthNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<DateOfBirthNode>> provideInstanceProviderMap(
        Provider<PersonGeneralNodeChildProvider.DateOfBirthNodeRuleProvider> dateOfBirthNodeRuleProvider
    ) {
        Map<String, RuleProvider<DateOfBirthNode>> result = new HashMap<>();
        result.put("dateOfBirthNode", dateOfBirthNodeRuleProvider.get());
        return result;
    }
}