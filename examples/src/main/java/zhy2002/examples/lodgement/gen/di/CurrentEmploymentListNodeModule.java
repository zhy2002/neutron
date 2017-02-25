package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class CurrentEmploymentListNodeModule {

    private final CurrentEmploymentListNode owner;

    public CurrentEmploymentListNodeModule(CurrentEmploymentListNode owner) {
        this.owner = owner;
    }

    @Provides @CurrentEmploymentListNodeScope @Owner CurrentEmploymentListNode provideCurrentEmploymentListNode() {
        return owner;
    }

    @Provides @CurrentEmploymentListNodeScope @Owner ListUiNode<?,?> provideListUiNode() {
        return owner;
    }

    @Provides @CurrentEmploymentListNodeScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @CurrentEmploymentListNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

}