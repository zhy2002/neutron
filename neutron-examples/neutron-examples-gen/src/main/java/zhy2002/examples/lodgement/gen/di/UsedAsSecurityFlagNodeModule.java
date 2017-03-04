package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class UsedAsSecurityFlagNodeModule {

    private final UsedAsSecurityFlagNode owner;

    public UsedAsSecurityFlagNodeModule(UsedAsSecurityFlagNode owner) {
        this.owner = owner;
    }

    @Provides @UsedAsSecurityFlagNodeScope @Owner UsedAsSecurityFlagNode provideUsedAsSecurityFlagNode() {
        return owner;
    }

    @Provides @UsedAsSecurityFlagNodeScope @Owner BooleanUiNode<?> provideBooleanUiNode() {
        return owner;
    }

    @Provides @UsedAsSecurityFlagNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @UsedAsSecurityFlagNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @UsedAsSecurityFlagNodeScope UsageNode provideUsageNode() {
        return owner.getParent();
    }

}