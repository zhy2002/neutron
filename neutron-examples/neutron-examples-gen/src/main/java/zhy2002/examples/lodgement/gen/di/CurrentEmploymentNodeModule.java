package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class CurrentEmploymentNodeModule {

    private final CurrentEmploymentNode owner;

    public CurrentEmploymentNodeModule(CurrentEmploymentNode owner) {
        this.owner = owner;
    }

    @Provides @CurrentEmploymentNodeScope @Owner CurrentEmploymentNode provideCurrentEmploymentNode() {
        return owner;
    }

    @Provides @CurrentEmploymentNodeScope @Owner EmploymentNode<?> provideEmploymentNode() {
        return owner;
    }

    @Provides @CurrentEmploymentNodeScope @Owner ObjectUiNode<?> provideObjectUiNode() {
        return owner;
    }

    @Provides @CurrentEmploymentNodeScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @CurrentEmploymentNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @CurrentEmploymentNodeScope CurrentEmploymentListNode provideCurrentEmploymentListNode() {
        return owner.getParent();
    }

}