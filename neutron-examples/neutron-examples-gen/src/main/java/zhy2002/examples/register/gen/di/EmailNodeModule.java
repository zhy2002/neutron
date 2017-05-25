package zhy2002.examples.register.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.register.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class EmailNodeModule {

    private final EmailNode owner;

    public EmailNodeModule(EmailNode owner) {
        this.owner = owner;
    }

    @Provides @EmailNodeScope @Owner EmailNode provideEmailNode() {
        return owner;
    }

    @Provides @EmailNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @EmailNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @EmailNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @EmailNodeScope RegisterNode provideRegisterNode() {
        return owner.getParent();
    }

    @Provides @EmailNodeScope
    RuleProvider<EmailNode> provideRuleProvider(Provider<EmailNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @EmailNodeScope
    Map<String, RuleProvider<EmailNode>> provideInstanceProviderMap(
        Provider<RegisterNodeChildProvider.EmailNodeRuleProvider> emailNodeRuleProvider
    ) {
        Map<String, RuleProvider<EmailNode>> result = new HashMap<>();
        result.put("emailNode", emailNodeRuleProvider.get());
        return result;
    }
}