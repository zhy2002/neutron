package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class ApprovalInPrincipleFlagNodeModule {

    private final ApprovalInPrincipleFlagNode owner;

    public ApprovalInPrincipleFlagNodeModule(ApprovalInPrincipleFlagNode owner) {
        this.owner = owner;
    }

    @Provides @ApprovalInPrincipleFlagNodeScope @Owner ApprovalInPrincipleFlagNode provideApprovalInPrincipleFlagNode() {
        return owner;
    }

    @Provides @ApprovalInPrincipleFlagNodeScope @Owner BooleanUiNode<?> provideBooleanUiNode() {
        return owner;
    }

    @Provides @ApprovalInPrincipleFlagNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @ApprovalInPrincipleFlagNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

}