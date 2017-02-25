package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class SelfEmployedNodeModule {

    private final SelfEmployedNode owner;

    public SelfEmployedNodeModule(SelfEmployedNode owner) {
        this.owner = owner;
    }

    @Provides @SelfEmployedNodeScope @Owner SelfEmployedNode provideSelfEmployedNode() {
        return owner;
    }

    @Provides @SelfEmployedNodeScope @Owner EmployedNode provideEmployedNode() {
        return owner;
    }

    @Provides @SelfEmployedNodeScope @Owner ObjectUiNode<?> provideObjectUiNode() {
        return owner;
    }

    @Provides @SelfEmployedNodeScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @SelfEmployedNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

}