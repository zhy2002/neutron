package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import dagger.multibindings.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;
import zhy2002.neutron.util.NeutronConstants;


@Module
public class ProductAccountHolderListNodeModule {

    private final ProductAccountHolderListNode owner;

    public ProductAccountHolderListNodeModule(ProductAccountHolderListNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner ProductAccountHolderListNode provideProductAccountHolderListNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner SelectAccountHolderListNode<?> provideSelectAccountHolderListNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner ListUiNode<?,?> provideListUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ComponentScope ProductDescriptionNode provideProductDescriptionNode() {
        return owner.getParent();
    }

    @Provides @Named("ProductAccountHolderListNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<ProductAccountHolderListNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("ProductAccountHolderListNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<ProductAccountHolderListNode> provideTypeRuleProvider(ProductAccountHolderListNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<ProductAccountHolderListNode>> provideRuleProviders(
        @Named("ProductAccountHolderListNodeRuleProvider")  Map<String, Provider<RuleProvider<ProductAccountHolderListNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}